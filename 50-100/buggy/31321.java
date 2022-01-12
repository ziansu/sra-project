@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.edit_listing_activity);
    requestPermissions();
    mRecordSessionManager = new com.carltaylordev.recordlisterandroidclient.UserInterface.EditListing.RecordSessionManager(getRecordFromIntent(), io.realm.Realm.getDefaultInstance(), this);
    setupViewPager();
    setupSaveFab();
    setupTestFab();
}