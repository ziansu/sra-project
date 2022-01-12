private void setupTasksList() {
    adapter = new com.ihunter.taskee.adapters.TaskItemAdapter(getActivity());
    allTasks.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    allTasks.setEmptyView(todoListEmptyView);
    allTasks.setHasFixedSize(true);
    allTasks.setAdapter(adapter);
    allTasks.addItemDecoration(new com.ihunter.taskee.ui.SimpleDividerItemDecoration(getContext()));
}