@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.newstand.datamigration.provider.SettingsProvider.init(this);
    org.newstand.logger.Logger.config(org.newstand.logger.Settings.builder().tag(getClass().getSimpleName()).logLevel((org.newstand.datamigration.provider.SettingsProvider.isDebugEnabled() ? Logger.LogLevel.ALL : Logger.LogLevel.WARN)).logAdapter(new org.newstand.datamigration.utils.OnDeviceLogAdapter()).build());
    io.realm.Realm.init(this);
    org.newstand.datamigration.secure.DonateQRPathRetriever.loadAndCache(this);
    org.newstand.datamigration.service.DummSmsServiceProxy.startService(this);
    registerActivityLifecycleCallbacks(topActivityObserver);
}