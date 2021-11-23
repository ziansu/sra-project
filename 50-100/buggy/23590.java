@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    acr.browser.lightning.app.BrowserApp.mAppComponent = acr.browser.lightning.app.DaggerAppComponent.builder().appModule(new acr.browser.lightning.app.AppModule(this)).build();
    acr.browser.lightning.app.BrowserApp.mAppComponent.inject(this);
    com.squareup.leakcanary.LeakCanary.install(this);
}