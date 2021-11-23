public organizer.logic.Task addFloatingTask(java.lang.String taskName, int taskID) {
    organizer.logic.Task floatTask = new organizer.logic.Task();
    floatTask.setTaskName(taskName);
    floatTask.setTaskID(taskID);
    floatTask.setTaskType(organizer.logic.AddTask.TYPE_FLOATING);
    return floatTask;
}