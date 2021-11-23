public void onClick(android.content.DialogInterface dialog, int id) {
    tasks.add(touchedTask);
    tasks.remove(touchedTask);
    touchedTask.setComplete(true);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}