@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.buoyantec.iGrid.App.sInstance = this;
    setLoginEngine();
    setEngine();
}