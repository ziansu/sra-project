public <T> void insertArg(api.Argument<T> arg, long id, int slotIndex) {
    api.Task task = this.waitingQueue.get(id);
    if (task == null)
        return ;
    
    synchronized(task) {
        task.insertArg(arg, slotIndex);
        if (task.isReady()) {
            synchronized(this.waitingQueue) {
                this.waitingQueue.remove(id);
            }
            this.issueTask(task);
        }
    }
}