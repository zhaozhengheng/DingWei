package com.bawei.dingWei;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by 1 on 2017/3/28.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
