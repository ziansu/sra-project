@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_authors);
    setInitialValues();
    initiateActionBar();
    setInitialRecyclerView();
    dbManager.read();
    updateControl = new fw.musicauthors.ListAuthorsActivity.UpdateControl();
    updateControl.everyHalfHour();
}