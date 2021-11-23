@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.support.multidex.MultiDex.install(this);
    com.grandmagic.readingmate.base.AppBaseApplication.ctx = this;
    com.facebook.stetho.Stetho.initializeWithDefaults(this);
    com.squareup.leakcanary.LeakCanary.install(this);
    com.umeng.analytics.MobclickAgent.setCatchUncaughtExceptions(true);
    com.umeng.analytics.MobclickAgent.setScenarioType(getApplicationContext(), MobclickAgent.EScenarioType.E_UM_NORMAL);
    initOther();
    initIM();
    com.umeng.socialize.Config.DEBUG = true;
    com.umeng.socialize.UMShareAPI.get(this);
    com.tencent.bugly.crashreport.CrashReport.setIsDevelopmentDevice(this, true);
    com.tencent.bugly.crashreport.CrashReport.initCrashReport(getApplicationContext());
    initUPush();
}