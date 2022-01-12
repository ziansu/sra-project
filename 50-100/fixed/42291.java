@java.lang.Override
public void dispose() {
    logger.debug("Handler disposed for thing {}", getThing().getUID());
    if (((pollingJob) != null) && (!(pollingJob.isCancelled()))) {
        pollingJob.cancel(true);
        pollingJob = null;
    }
    removeSubscription();
}