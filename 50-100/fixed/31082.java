@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.iyuba.music.manager.RuntimeManager.initRuntimeManager(this);
    int i = shouldInit();
    if (i >= 0) {
        pushSdkInit();
    }
    if (i == 0) {
        prepareForApp();
        activityList = new java.util.ArrayList<>();
        startService(new android.content.Intent(getApplicationContext(), com.iyuba.music.service.PlayerService.class));
        com.iyuba.music.CrashHandler crashHandler = new com.iyuba.music.CrashHandler(this);
        java.lang.Thread.setDefaultUncaughtExceptionHandler(crashHandler);
    }
}