public void onClick(android.content.DialogInterface dialog, int id) {
    touchedTask.setName(("[Completed] " + (touchedTask.getName())));
    tasks.add(touchedTask);
    tasks.remove(touchedTask);
    touchedTask.setComplete(true);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    parent.notifyTasksChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}