@java.lang.Override
public void run() {
    try {
        doRun();
        if (!(cancelled.get()))
            lifecycleListener.onShutdown(id);
        
    } catch (java.lang.Throwable t) {
        org.apache.kafka.connect.runtime.WorkerTask.log.error("Task {} threw an uncaught and unrecoverable exception", id);
        org.apache.kafka.connect.runtime.WorkerTask.log.error("Task is being killed and will not recover until manually restarted:", t);
        if (!(cancelled.get()))
            lifecycleListener.onFailure(id, t);
        
    }
}