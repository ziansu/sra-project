@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mainlist);
    createAdHandler();
    createToolbar();
    findDataController();
    if ((dataController) == null) {
        createDataController();
    }
    findListView();
    if ((mReminderListFragment) == null) {
        setTracker();
        createListView();
    }
}