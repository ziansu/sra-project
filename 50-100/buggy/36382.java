synchronized void stop() throws java.lang.InterruptedException {
    if (((executor) != null) && (!(executor.isShutdown()))) {
        stopTime = java.lang.System.currentTimeMillis();
        elapsedTime = (stopTime) - (startTime);
        executor.shutdownNow();
    }else {
        throw new java.lang.IllegalStateException();
    }
    logStats();
    logger.info(marker, "{}", getReportMsg());
}