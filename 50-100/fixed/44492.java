@java.lang.Override
public void onCreate() {
    super.onCreate();
    chihane.trans.global.App.component = AppComponent.Initializer.init(this);
    chihane.trans.global.App.graph = chihane.trans.global.App.component;
    com.crashlytics.android.core.CrashlyticsCore core = new com.crashlytics.android.core.CrashlyticsCore.Builder().disabled(BuildConfig.DEBUG).build();
    com.crashlytics.android.Crashlytics crashlytics = new com.crashlytics.android.Crashlytics.Builder().core(core).build();
    io.fabric.sdk.android.Fabric.with(this, crashlytics);
    butterknife.ButterKnife.setDebug(BuildConfig.DEBUG);
    com.orhanobut.logger.Logger.init();
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preference, false);
}