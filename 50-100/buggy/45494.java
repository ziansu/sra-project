@java.lang.Override
public void dispose() {
    logger.debug("Disposing Helios IP handler.");
    updateStatus(ThingStatus.OFFLINE);
    try {
        unsubscribe();
        if ((endpoint) != null) {
            endpoint.stop();
        }
        endpoint = null;
        terminationTime = null;
        context = null;
        notificationProducer = null;
        subscription = null;
    } catch (java.lang.Exception e) {
        logger.error("An exception occurred while disposing the Helios Thing Handler : {}", e.getMessage());
        e.printStackTrace();
    }
}