private org.ow2.proactive.scheduler.task.internal.InternalTask createTask(int jobId, int taskId) {
    org.ow2.proactive.scheduler.task.internal.InternalTask task1 = new org.ow2.proactive.scheduler.task.internal.InternalScriptTask();
    task1.setId(org.ow2.proactive.scheduler.task.TaskIdImpl.createTaskId(new org.ow2.proactive.scheduler.job.JobIdImpl(jobId, java.lang.Integer.toString(jobId)), ("task" + taskId), taskId));
    return task1;
}