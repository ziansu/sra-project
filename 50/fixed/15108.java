@java.lang.Override
public void onCreate() {
    if (Configuration.IS_EINK_DEVICE) {
        setTheme(R.style.Theme_AppCompat_Light);
    }
    super.onCreate();
    net.zorgblub.typhon.Typhon.instance = this;
}