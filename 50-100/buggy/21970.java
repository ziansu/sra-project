@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_notebook_list);
    android.util.Log.d(io.keepcoding.rgs.everpobre.activities.NotebookListActivity.TAG, "Hello from Activitie");
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    if (fm != null) {
        io.keepcoding.rgs.everpobre.fragments.NotebooksFragment notebooksFragment = new io.keepcoding.rgs.everpobre.fragments.NotebooksFragment();
        fm.beginTransaction().add(R.id.activity_notebook_fragment_container, notebooksFragment, "").commit();
    }
}