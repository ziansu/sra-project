private boolean isQueueStillFilled() {
    return (scanInProgress.get()) || (!(filesToHashQueue.isEmpty()));
}