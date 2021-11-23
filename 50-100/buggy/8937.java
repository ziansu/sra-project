@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.support.v7.widget.RecyclerView tasksList = getView().findViewById(R.id.finished_tasks_recycler_view);
    tasksList.setHasFixedSize(true);
    tasksList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    android.support.v7.widget.RecyclerView.Adapter mAdapter = new com.example.hasmik_n.todolist.handlers.TasksRecyclerViewAdapter(tasks);
    tasksList.setAdapter(mAdapter);
}