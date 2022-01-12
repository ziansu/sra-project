public void newWaitingTask() {
    setNumberOfPendingTasks(((getNumberOfPendingTasks()) + 1));
    setNumberOfRunningTasks(((getNumberOfRunningTasks()) - 1));
    if (((getNumberOfRunningTasks()) == 0) && (!(((getStatus()) == (org.ow2.proactive.scheduler.common.job.JobStatus.PAUSED)) || ((getStatus()) == (org.ow2.proactive.scheduler.common.job.JobStatus.IN_ERROR))))) {
        setStatus(JobStatus.STALLED);
    }
}