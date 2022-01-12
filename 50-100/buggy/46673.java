@java.lang.Override
protected final void post() {
    this.observer.setTaskCount(subTasks.size());
    for (com.zte.mw.sdn.infrastructure.task.MonitoredTask task : subTasks) {
        pool.execute(task);
    }
    try {
        synchronized(this) {
            this.wait();
        }
    } catch (java.lang.InterruptedException e) {
    }
    postWithResults(observer.getResults());
}