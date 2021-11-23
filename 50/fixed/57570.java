public organizer.logic.Task addFloatingTask(java.lang.String taskName, organizer.logic.Task floatTask) {
    floatTask.setTaskName(taskName);
    floatTask.setTaskType(organizer.logic.AddTask.TYPE_FLOATING);
    return floatTask;
}