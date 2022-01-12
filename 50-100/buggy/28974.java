public void abortAllTaskGroups() {
    taskGroupRemoveLock.lock();
    try {
        while (!(this.taskGroupList.isEmpty())) {
            for (se.unlogic.standardutils.threads.SimpleExecutionController<T> executionController : taskGroupList) {
                executionController.abort();
            }
        } 
    } finally {
        taskGroupRemoveLock.unlock();
    }
}