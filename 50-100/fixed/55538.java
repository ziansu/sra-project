private void populateDataForList() {
    pbList.setVisibility(View.VISIBLE);
    final com.training.tiennguyen.todoappproject.databases.TaskDBHelper dbHelper = new com.training.tiennguyen.todoappproject.databases.TaskDBHelper(this);
    final java.util.List<com.training.tiennguyen.todoappproject.models.TaskModel> list = dbHelper.selectAllTasks();
    final com.training.tiennguyen.todoappproject.adapters.TaskAdapter adapter = new com.training.tiennguyen.todoappproject.adapters.TaskAdapter(this, R.layout.list_tasks_item, list);
    lvTasks.setAdapter(adapter);
    lvTasks.setEmptyView(txtEmptyList);
    pbList.setVisibility(View.GONE);
}