@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    taskList = new java.util.ArrayList<>();
    tasksAdapter = new com.vjimbei.backbase_hackathon_android.ui.adapter.TasksAdapter(getContext(), this);
    presenter = new com.vjimbei.backbase_hackathon_android.presenter.TasksPresenter(this);
    sortActive = getArguments().getBoolean(com.vjimbei.backbase_hackathon_android.ui.fragment.AllTasksFragment.EXTRA_ACTIVE_TASKS);
}