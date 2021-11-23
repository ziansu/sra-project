public void onTaskNotify(flowy.scheduler.protocal.Messages.TaskNotify notify) {
    java.lang.String taskId = notify.getTaskId();
    flowy.scheduler.javasdk.ITaskNotifyCallback callback = taskCallbacks.get(taskId);
    flowy.scheduler.javasdk.Task task = tasks.get(taskId);
    callback.onTaskNotify(this, task, notify.getTaskInstanceId());
    threadPool.execute(new flowy.scheduler.javasdk.TaskNotifyCallbackRunner(this, task, notify.getTaskInstanceId(), callback));
}