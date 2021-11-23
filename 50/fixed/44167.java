public <T> void suspendTask(api.Task<T> task, long taskId, boolean mode) {
    synchronized(this.waitingQueue) {
        this.waitingQueue.put(taskId, task);
    }
}