public static boolean validateTasksList(java.util.List<java.lang.String> taskList, java.lang.String assignee) {
    if (taskList != null) {
        org.activiti.engine.task.TaskQuery taskQuery = org.wso2.carbon.bpmn.people.substitution.UserSubstitutionOperations.taskService.createTaskQuery();
        for (java.lang.String taskId : taskList) {
            taskQuery.taskId(taskId);
            taskQuery.taskAssignee(assignee);
            java.util.List<org.activiti.engine.task.Task> tasks = taskQuery.list();
            if (tasks == null) {
                return false;
            }
        }
    }
    return true;
}