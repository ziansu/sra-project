private java.lang.String setDescription(main.java.backend.Logic.Command commandObject) {
    int taskIndex = java.lang.Integer.parseInt(commandObject.getTaskName());
    java.lang.String description = commandObject.getDescription();
    int taskId = getTaskId(taskIndex);
    taskList = storage.load();
    taskList.get(taskId).setDone(false);
    taskList.get(taskId).setDescription(description);
    storage.save(taskList);
    return java.lang.String.format(main.java.backend.Logic.LogicEditor.EXECUTION_SET_DESCRIPTION_SUCCESSFUL, taskId);
}