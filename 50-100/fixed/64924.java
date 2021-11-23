public void stopFanListener() {
    if ((listenerJob) != null) {
        logger.debug("Stopping fan listener for {} at {}", thingID(), ipAddress);
        terminate = true;
        listenerJob.cancel(true);
        listenerJob = null;
    }
    conn.cancelConnectionMonitorJob();
    conn.disconnect();
}