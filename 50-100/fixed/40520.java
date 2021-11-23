@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) {
        com.facebook.stetho.Stetho.initialize(com.facebook.stetho.Stetho.newInitializerBuilder(this).enableDumpapp(com.facebook.stetho.Stetho.defaultDumperPluginsProvider(this)).enableWebKitInspector(com.facebook.stetho.Stetho.defaultInspectorModulesProvider(this)).build());
    }
    net.gotev.uploadservice.UploadService.NAMESPACE = BuildConfig.APPLICATION_ID;
    net.gotev.uploadservice.Logger.setLogLevel(Logger.LogLevel.DEBUG);
    net.gotev.uploadservice.UploadService.HTTP_STACK = new net.gotev.uploadservice.okhttp.OkHttpStack(getOkHttpClient());
    net.gotev.uploadservice.UploadService.BACKOFF_MULTIPLIER = 2;
}