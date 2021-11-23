@java.lang.Override
public void onCreate() {
    com.winsonchiu.reader.CustomApplication.application = this;
    refWatcher = com.squareup.leakcanary.LeakCanary.install(this);
    super.onCreate();
    com.winsonchiu.reader.AppSettings.initPrefs(getApplicationContext());
}