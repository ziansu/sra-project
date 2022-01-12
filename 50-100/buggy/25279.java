public void addTask(hu.trio.tasks.Task parent, hu.trio.tasks.Task task) {
    SQLHelp.open();
    SQLHelp.addTask(task);
    SQLHelp.close();
    if (parent == null) {
        hu.trio.taskList.TasksActivity.DB.tasks.add(task);
    }else {
        parent.addSubTask(task);
    }
}