@java.lang.Override
public void onCreate() {
    super.onCreate();
    timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
    android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
}