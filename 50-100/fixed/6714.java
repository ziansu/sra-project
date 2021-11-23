private com.taskboard.main.Response addFloatingTask() {
    com.taskboard.main.Response responseForAddFloating = new com.taskboard.main.Response();
    java.lang.String taskName = getDetailFromParameter(getNameParameter());
    java.lang.String priority = getDetailFromParameter(getPriorityParameter());
    java.lang.String category = getDetailFromParameter(getCategoryParameter());
    responseForAddFloating = processFloatingTaskForStorage(taskName, priority, category);
    return responseForAddFloating;
}