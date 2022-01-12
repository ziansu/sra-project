public void jobDone() {
    try {
        lock.lock();
        final long completedJobID = problemID.getAndIncrement();
        final java.util.concurrent.ScheduledFuture scheduledFuture = idToFuture.remove(completedJobID);
        if (scheduledFuture != null) {
            log.trace("Cancelling future for completed ID {}", completedJobID);
            scheduledFuture.cancel(false);
        }
    } finally {
        lock.unlock();
    }
}