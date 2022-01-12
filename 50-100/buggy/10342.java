@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG)
        com.facebook.stetho.Stetho.initializeWithDefaults(this);
    
    android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().penaltyDialog().build());
    android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
}