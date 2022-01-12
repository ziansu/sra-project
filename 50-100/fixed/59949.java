public com.famstack.projectscheduler.datatransferobject.TaskItem updateTaskStatus(int taskId, com.famstack.projectscheduler.contants.TaskStatus taskStatus, java.lang.String comments) {
    com.famstack.projectscheduler.datatransferobject.TaskItem taskItem = getTaskItemById(taskId);
    if (taskItem != null) {
        taskItem.setStatus(taskStatus);
        famstackUserActivityManager.setProjectTaskActivityActualTime(taskId, new java.util.Date(), comments, taskStatus);
    }
    getFamstackDataAccessObjectManager().updateItem(taskItem);
    return taskItem;
}