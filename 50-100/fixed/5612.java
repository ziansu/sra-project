@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.support.multidex.MultiDex.install(this);
    super.onCreate(savedInstanceState);
    if (!(BuildConfig.DEBUG))
        io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    
    setContentView(R.layout.activity_splash_screen);
    butterknife.ButterKnife.bind(this);
    mContext = this;
    io.realm.RealmConfiguration realmConfiguration = new io.realm.RealmConfiguration.Builder(this).name(Realm.DEFAULT_REALM_NAME).deleteRealmIfMigrationNeeded().build();
    io.realm.Realm.setDefaultConfiguration(realmConfiguration);
}