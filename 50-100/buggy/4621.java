@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_authors);
    android.transition.Fade fade = ((android.transition.Fade) (android.transition.TransitionInflater.from(this).inflateTransition(R.transition.activity_fade)));
    getWindow().setExitTransition(fade);
    setInitialValues();
    initiateActionBar();
    setInitialRecyclerView();
    dbManager.read();
    updateControl = new fw.musicauthors.ListAuthorsActivity.UpdateControl();
    updateControl.everyHalfHour();
}