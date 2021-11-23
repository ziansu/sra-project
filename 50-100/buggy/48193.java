void add(se.unlogic.standardutils.threads.SimpleExecutionController<T> executionController) {
    taskGroupAddLock.lock();
    try {
        if ((status) == (Status.RUNNING)) {
            this.taskGroupList.add(executionController);
            taskGroupAddCondition.signalAll();
        }else {
            throw new java.util.concurrent.RejectedExecutionException(("TaskGroupHandler status " + (status)));
        }
    } finally {
        taskGroupAddLock.unlock();
    }
}