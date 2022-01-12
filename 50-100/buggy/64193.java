public void doExecute(thread.DoubleQueue<thread.Task> taskQueue) {
    for (int i = 0; i < ((this.corePoolSize) + 1); i++) {
        this.executor.execute(new thread.CrawThread(taskQueue, new listener.PostContentListener(("Thread-" + i), taskQueue)));
    }
    currentPoolSize = (corePoolSize) + 1;
}