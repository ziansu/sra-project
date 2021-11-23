public synchronized boolean removeTask(long taskId) throws java.lang.Exception {
    if (isClosed) {
        throw new java.lang.Exception("thread pool is closed");
    }
    synchronized(workersMap) {
        java.lang.Long workerId = tasksMap.get(taskId);
        if (workerId != null) {
            pool.MyCachedThreadPool.Worker worker = workersMap.get(workerId);
            worker.getThread().interrupt();
            return true;
        }
        return false;
    }
}