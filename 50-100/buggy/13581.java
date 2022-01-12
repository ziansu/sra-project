private java.lang.String setReminder(main.java.backend.Logic.Command commandObject) {
    int taskIndex = java.lang.Integer.parseInt(commandObject.getTaskName());
    java.lang.String reminder = commandObject.getReminder();
    int taskId = getTaskId(taskIndex);
    taskList = storage.load();
    taskList.get(taskId).setDone(false);
    taskList.get(taskId).setReminder(reminder);
    storage.save(taskList);
    return java.lang.String.format(main.java.backend.Logic.LogicEditor.EXECUTION_SET_REMINDER_SUCCESSFUL, taskId, reminder);
}