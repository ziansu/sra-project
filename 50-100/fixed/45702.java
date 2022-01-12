public boolean stopTask(java.lang.String taskUid) {
    pt.ua.dicoogle.sdk.task.Task<pt.ua.dicoogle.sdk.datastructs.Report> task = taskRunningList.get(taskUid);
    if (task != null) {
        return task.cancel(true);
    }else {
        pt.ua.dicoogle.taskManager.RunningIndexTasks.logger.info("Attempt to stop unexistent task {}, ignoring", taskUid);
    }
    return false;
}