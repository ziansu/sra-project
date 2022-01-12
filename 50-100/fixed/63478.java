public <T> api.Task<T> fetchTask(boolean mode) throws java.lang.InterruptedException {
    synchronized(this.readyQueue) {
        if (!(this.readyQueue.isEmpty())) {
            api.Task<T> task = this.readyQueue.getLast();
            if (mode == (space.SpaceImpl.MODE_SPACE))
                this.shadow.put(task.taskId, task);
            
            return this.readyQueue.takeLast();
        }
        return null;
    }
}