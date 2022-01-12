@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.hon.sunny.base.BaseApplication.sAppContext = getApplicationContext();
    if (!(com.hon.sunny.BuildConfig.DEBUG)) {
    }
    if (((getApplicationContext().getExternalCacheDir()) != null) && (ExistSDCard())) {
        com.hon.sunny.base.BaseApplication.sCacheDir = getApplicationContext().getExternalCacheDir().toString();
    }else {
        com.hon.sunny.base.BaseApplication.sCacheDir = getApplicationContext().getCacheDir().toString();
    }
}