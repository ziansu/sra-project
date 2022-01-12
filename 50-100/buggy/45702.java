public boolean stopTask(java.lang.String taskUid) {
    pt.ua.dicoogle.sdk.task.Task<pt.ua.dicoogle.sdk.datastructs.Report> task = taskRunningList.get(taskUid);
    if (task != null) {
        boolean canceled = task.cancel(true);
        if (canceled) {
            return true;
        }
    }else {
        pt.ua.dicoogle.taskManager.RunningIndexTasks.logger.warn("Attempt to stop unexistent task {}, ignoring", taskUid);
    }
    return false;
}