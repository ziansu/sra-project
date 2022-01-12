public void awaitTermination(long timeout) throws java.lang.InterruptedException {
    taskGroupRemoveLock.lock();
    try {
        while (!(taskGroupList.isEmpty())) {
            taskGroupRemoveCondition.await(timeout, java.util.concurrent.TimeUnit.MILLISECONDS);
        } 
    } finally {
        taskGroupRemoveLock.unlock();
    }
}