protected void edit(int taskID, tucklife.parser.ProtoTask toEditTask) {
    for (tucklife.storage.Task task : taskList) {
        if (hasFoundID(taskID, task)) {
            int taskIndex = taskList.indexOf(task);
            tucklife.storage.Task newTask = task.edit(toEditTask);
            taskList.set(taskIndex, newTask);
        }
    }
}