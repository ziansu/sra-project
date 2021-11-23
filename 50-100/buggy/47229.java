@java.lang.Override
public void run() {
    lock.lock();
    if (runningTask.isCancelled()) {
        return ;
    }
    try {
        this.runOneIteration();
    } catch (java.lang.Throwable t) {
        try {
            shutDown();
        } catch (java.lang.Exception ignored) {
            com.google.common.util.concurrent.AbstractScheduledService.logger.log(java.util.logging.Level.WARNING, "Error while attempting to shut down the service after failure.", ignored);
        }
        notifyFailed(t);
        runningTask.cancel(false);
    } finally {
        lock.unlock();
    }
}