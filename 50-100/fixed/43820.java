public info.Task clone() {
    info.Task taskClone = new info.Task(this.taskId, this.stageId, this.stageAttemptId, this.jobId, this.appId, this.containerId);
    taskClone.taskMetrics = new java.util.ArrayList(this.taskMetrics);
    taskClone.taskStamps = this.taskStamps.clone();
    taskClone.currentMetrics = this.currentMetrics;
    taskClone.lastMetrics = this.lastMetrics;
    return taskClone;
}