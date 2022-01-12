@java.lang.Override
public void dispose() {
    logger.debug("Disposing the Helios IP Vario handler for '{}'.", getThing().getUID().toString());
    if ((logSubscriptionID) != 0) {
        unsubscribe();
    }
    if (((logJob) != null) && (!(logJob.isCancelled()))) {
        logJob.cancel(true);
        logJob = null;
    }
    if ((heliosClient) != null) {
        heliosClient.close();
    }
}