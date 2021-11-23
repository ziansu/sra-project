public void addTask(hu.trio.tasks.Task parent, hu.trio.tasks.Task task) {
    SQLHelp.open();
    SQLHelp.addTask(task);
    SQLHelp.close();
    if (parent == null) {
        hu.trio.taskList.TasksActivity.DB.tasks.add(0, task);
    }else {
        parent.addSubTask(0, task);
    }
}