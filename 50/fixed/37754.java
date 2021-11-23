@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (getApplicationContext().getPackageName().equals(processName)) {
        com.beanu.arad.support.log.KLog.init(BuildConfig.DEBUG);
    }
}