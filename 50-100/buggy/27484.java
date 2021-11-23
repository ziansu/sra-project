@java.lang.Override
public void onCreate() {
    super.onCreate();
    wang.mogujun.csdnplus.CSDNApplication.mInstance = this;
    wang.mogujun.csdnplus.data.cache.LoginPrefs.init(this);
    wang.mogujun.csdnplus.data.cache.UserDetailPrefs.init(this);
    initInjector();
    initLogger();
    initLeakCanary();
    initBlockCanary();
    initRealm();
}