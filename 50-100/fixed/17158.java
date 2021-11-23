private boolean removeFromTaskQueue(java.util.Collection<? extends org.threadly.concurrent.PriorityScheduler.TaskWrapper> queue, java.lang.Object queueRemoveLock, java.lang.Runnable task) {
    synchronized(queueRemoveLock) {
        java.util.Iterator<? extends org.threadly.concurrent.PriorityScheduler.TaskWrapper> it = queue.iterator();
        while (it.hasNext()) {
            org.threadly.concurrent.PriorityScheduler.TaskWrapper tw = it.next();
            if (org.threadly.concurrent.ContainerHelper.isContained(tw.task, task)) {
                tw.cancel();
                it.remove();
                return true;
            }
        } 
    }
    return false;
}