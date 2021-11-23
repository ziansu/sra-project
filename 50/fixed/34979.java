public void onClick(android.content.DialogInterface dialog, int id) {
    touchedTask.setComplete(true);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}