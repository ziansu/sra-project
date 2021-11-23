public boolean remove(java.util.concurrent.Callable<?> task) {
    return (removeFromTaskQueue(executeQueue, executeQueueRemoveLock, task)) || (removeFromTaskQueue(scheduleQueue, scheduleQueue.getModificationLock(), task));
}