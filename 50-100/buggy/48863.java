@java.lang.Override
protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable throwable) {
    super.afterExecute(runnable, throwable);
    synchronized(runningWorkers) {
        runningWorkers.remove(((org.apache.nutch.api.impl.JobWorker) (runnable)).getInfo());
    }
    org.apache.nutch.api.impl.JobWorker worker = ((org.apache.nutch.api.impl.JobWorker) (runnable));
    addStatusToHistory(worker);
}