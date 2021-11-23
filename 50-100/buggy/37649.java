@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        isFirstLoadThisSession = true;
        timber.log.Timber.i("First time opening app this session");
    }else {
        _restorePreviousState(savedInstanceState);
    }
    ((com.objectivetruth.uoitlibrarybooking.app.UOITLibraryBookingApp) (getApplication())).getComponent().inject(this);
    setContentView(R.layout.activity_main);
    initializeAllMainFragmentsAndPreloadToView();
    setupToolbar(R.id.toolbar);
    setupDrawer(R.id.drawer_layout);
}