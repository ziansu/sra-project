@java.lang.Override
public void onCreate() {
    super.onCreate();
    appComponent = org.hisp.dhis.android.eventcapture.DaggerAppComponent.builder().appModule(new org.hisp.dhis.android.eventcapture.AppModule(this)).build();
    appComponent.inject(this);
    com.facebook.stetho.Stetho.initializeWithDefaults(this);
    org.hisp.dhis.client.sdk.android.api.D2.init(this, flavor);
    userComponent = appComponent.plus(new org.hisp.dhis.android.eventcapture.UserModule());
    rxBus = new org.hisp.dhis.android.eventcapture.RxBus();
}