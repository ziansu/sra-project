@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_navigation_view);
    com.sedsoftware.comicser.ComicserApp.getAppComponent().inject(this);
    setSupportActionBar(toolbar);
    setUpNavigationDrawerParams();
    navigateToCurrentSection();
    java.lang.String defaultSyncPeriod = comicPreferencesHelper.getSyncPeriod();
    com.sedsoftware.comicser.features.sync.ComicSyncManager.createSyncAccount(this, java.lang.Integer.parseInt(defaultSyncPeriod));
}