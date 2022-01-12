private java.util.List<udo.storage.Task> fillAddedTask() {
    udo.storage.Task.TaskType taskType = getTaskType();
    java.util.List<udo.storage.Task> tasks = new java.util.ArrayList<>();
    int numOfTasks = getNumberOfTasks(taskType);
    for (int i = 0; i < numOfTasks; i++) {
        udo.storage.Task task = new udo.storage.Task();
        task.setTaskType(taskType);
        fillTaskFromCommand(task, i);
        fillDefaults(task);
        tasks.add(task);
    }
    return tasks;
}