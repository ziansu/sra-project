private void clearInMemoryJobInfos(int jobId) {
    java.util.List<cn.shiyanjun.ddc.scheduling.platform.component.DefaultSchedulingManager.TaskID> clearedTasks = com.google.common.collect.Lists.newArrayList();
    java.util.LinkedList<cn.shiyanjun.ddc.scheduling.platform.component.DefaultSchedulingManager.TaskID> tasks = managedJobToTaskList.remove(jobId);
    for (cn.shiyanjun.ddc.scheduling.platform.component.DefaultSchedulingManager.TaskID id : tasks) {
        managedTaskIdToInfos.remove(id);
        clearedTasks.add(id);
    }
    managedJobIdToInfos.remove(jobId);
    cn.shiyanjun.ddc.scheduling.platform.component.DefaultSchedulingManager.LOG.info(((("In-memory state purged: jobId=" + jobId) + ", tasks=") + clearedTasks));
}