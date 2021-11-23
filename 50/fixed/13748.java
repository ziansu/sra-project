public boolean remove(java.lang.Runnable task) {
    return (removeFromTaskQueue(executeQueue, executeQueueRemoveLock, task)) || (removeFromTaskQueue(scheduleQueue, scheduleQueue.getModificationLock(), task));
}