public void onClick(android.content.DialogInterface dialog, int id) {
    tasks.remove(touchedTask);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    parent.notifyTasksChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}