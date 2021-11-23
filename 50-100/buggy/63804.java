private void onTaskInit(final org.apache.reef.runtime.common.driver.evaluator.pojos.TaskStatusPOJO taskStatusPOJO) {
    assert (org.apache.reef.runtime.common.driver.evaluator.pojos.State.INIT) == (taskStatusPOJO.getState());
    if (this.isKnown()) {
        org.apache.reef.runtime.common.driver.task.TaskRepresenter.LOG.log(java.util.logging.Level.WARNING, ("Received a INIT message for task with id {0}" + " which we have seen before. Ignoring the second message"), this.taskId);
    }else {
        final org.apache.reef.driver.task.RunningTask runningTask = new org.apache.reef.runtime.common.driver.task.RunningTaskImpl(this.evaluatorManager, this.taskId, this.context, this);
        this.messageDispatcher.onTaskRunning(runningTask);
        this.setState(State.RUNNING);
    }
}