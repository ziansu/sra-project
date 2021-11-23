@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(com.ripplex.fileobservertester.MainApplication.TAG, "onCreate()");
    manager = new com.ripplex.fileobservertester.FileObserverManager();
    manager.startWatch();
}