@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.vgomc.mchelper.base.AppApplication.appApplication = this;
    com.vgomc.mchelper.utility.CrashHandler crashHandler = com.vgomc.mchelper.utility.CrashHandler.getInstance();
    crashHandler.init(this);
    try {
        com.vgomc.mchelper.base.AppApplication.appVersion = getVersionName();
    } catch (java.lang.Exception e) {
        com.vgomc.mchelper.base.AppApplication.appVersion = "1.0";
        e.printStackTrace();
    }
    com.vgomc.mchelper.entity.setting.Configuration.initInstance();
    x.Ext.init(this);
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this);
}