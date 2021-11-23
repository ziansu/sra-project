@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    dbHelper = com.project.salminnella.prescoop.dbHelper.DatabaseHelper.getInstance(this);
    initViews();
    initToolbar();
    showProgressBar();
    initFirebase();
    if ((mSchoolsList) == null) {
        queryFirebase();
    }
    createRecycler();
    handleSearchFilterIntent(getIntent());
    buildBottomBar(savedInstanceState);
    initSwipeListener();
}