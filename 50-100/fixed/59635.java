@java.lang.Override
public R call() throws java.lang.Exception {
    com.github.kmkt.util.concurrent.TaskWorker<T, R> task = null;
    try {
        task = workerSupplier.get();
        runningTasks.incrementAndGet();
        R result = null;
        if (task != null) {
            result = task.doTask(req);
        }
        return result;
    } finally {
        if (((workerCollector) != null) && (task != null))
            workerCollector.collect(task);
        
        runningTasks.decrementAndGet();
        tasks.decrementAndGet();
    }
}