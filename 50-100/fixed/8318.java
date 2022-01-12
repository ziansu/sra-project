@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_todo);
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    if (savedInstanceState == null) {
        fragment = com.codepath.todoapp.fragments.TodoFragment.newInstatnce();
        getFragmentManager().beginTransaction().replace(R.id.fListContainer, fragment, "todo").addToBackStack("todo").commit();
    }
}