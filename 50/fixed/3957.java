private java.lang.String createTask() {
    Task task = new Task(this.commandDetails);
    tasks.add(task);
    storage.save(tasks);
    return displayAllTasks();
}