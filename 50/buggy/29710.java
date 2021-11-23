public void resumeTask(java.lang.String taskName) throws org.wso2.carbon.ntask.common.TaskException {
    java.lang.String memberId = this.getMemberIdFromTaskName(taskName, false);
    this.resumeTask(memberId, taskName);
    org.wso2.carbon.ntask.core.impl.clustered.TaskUtils.setTaskPaused(this.getTaskRepository(), taskName, true);
}