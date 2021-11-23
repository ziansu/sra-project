public boolean remove(java.lang.Runnable task) {
    return (org.threadly.concurrent.PriorityScheduler.removeFromTaskQueue(executeQueue, executeQueueRemoveLock, task)) || (org.threadly.concurrent.PriorityScheduler.removeFromTaskQueue(scheduleQueue, scheduleQueue.getModificationLock(), task));
}