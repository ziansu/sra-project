public <T> void issueTask(api.Task<T> task) {
    try {
        this.readyQueue.put(task);
        synchronized(lock) {
            this.lock.notifyAll();
        }
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}