@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.bubelov.coins.App.instance = this;
    bus = new com.bubelov.coins.util.MainThreadBus();
    initApi();
    databaseHelper = com.bubelov.coins.database.DatabaseFactory.newHelper(this);
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preferences, true);
    startService(com.bubelov.coins.service.sync.merchants.MerchantsSyncService.makeIntent(this, false));
}