@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.lzy.okgo.OkGo.init(this);
    com.blankj.utilcode.utils.Utils.init(this);
    org.litepal.LitePal.initialize(this);
    com.facebook.stetho.Stetho.initializeWithDefaults(this);
    com.tencent.bugly.crashreport.CrashReport.initCrashReport(getApplicationContext(), "28fd1d7829 ", true);
}