@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_task_edit);
    long id = getIntent().getLongExtra(com.dan190.manager.activity.TaskEditActivity.EXTRA_TASKID, 0L);
    android.app.Fragment fragment = com.dan190.manager.activity.fragment.TaskEditFragment.newInstance(id);
    java.lang.String fragmentTag = com.dan190.manager.activity.fragment.TaskEditFragment.DEFAULT_FRAGMENT_TAG;
    if (savedInstanceState == null) {
        getFragmentManager().beginTransaction().add(R.id.container, fragment, fragmentTag).commit();
    }
}