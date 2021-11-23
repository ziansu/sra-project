@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mainlist);
    createAdHandler();
    createToolbar();
    findListView();
    findDataController();
    if ((mReminderListFragment) == null) {
        setTracker();
        createListView();
    }
    if ((dataController) == null) {
        createDataController();
    }
}