private com.taskboard.main.Response addFloatingTask() {
    com.taskboard.main.Response responseForAddFloating = new com.taskboard.main.Response();
    com.taskboard.main.Parameter taskNameParameter = getNameParameter();
    java.lang.String taskName = getDetailFromParameter(taskNameParameter);
    com.taskboard.main.Parameter priorityParameter = getPriorityParameter();
    java.lang.String priority = getDetailFromParameter(priorityParameter);
    com.taskboard.main.Parameter categoryParameter = getCategoryParameter();
    java.lang.String category = getDetailFromParameter(categoryParameter);
    responseForAddFloating = processFloatingTaskForStorage(taskName, priority, category);
    return responseForAddFloating;
}