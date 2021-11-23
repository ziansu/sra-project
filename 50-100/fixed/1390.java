public void execute(java.lang.Runnable task) {
    if (!(alive.get())) {
        throw new java.lang.IllegalStateException("Trying to submit new task after shut down!");
    }
    java.lang.Thread current = java.lang.Thread.currentThread();
    if (current instanceof com.den.concurrency.WorkingQueue.Worker) {
        threadTasksStorage.get().addLast(task);
    }else {
        synchronized(tasks) {
            tasks.addLast(task);
            tasks.notify();
        }
    }
}