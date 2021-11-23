synchronized void stop() throws java.lang.InterruptedException {
    if (((executor) != null) && (!(executor.isShutdown()))) {
        stopTime = java.lang.System.currentTimeMillis();
        elapsedTime = (stopTime) - (startTime);
        executor.shutdownNow();
        logStats();
        logger.info(marker, "{}", getReportMsg());
    }
}