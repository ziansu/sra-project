@java.lang.Override
public <T> void clearShadow(api.Task<T> task, int jobId) throws java.rmi.RemoteException {
    this.jobContextMap.get(jobId).clearShadow(task, task.taskId, this.mode);
}