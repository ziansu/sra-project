protected java.lang.String poll() {
    logger.info(java.lang.String.format("Polling the queue, waiting up to %s.", pollTimeout));
    java.lang.String file = null;
    try {
        file = queue.poll(pollTimeout.getDuration(), pollTimeout.getUnit());
    } catch (java.lang.NullPointerException e) {
        return file;
    } catch (java.lang.InterruptedException e) {
        logger.info("Thread interrupted while waiting to poll.");
        java.lang.Thread.currentThread().interrupt();
    }
    return file;
}