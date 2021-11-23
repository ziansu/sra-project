synchronized void reportStopped() throws java.io.IOException {
    if ((downloadProgressNotificationHandler) != null) {
        sequentialTaskExecutor.submit(() -> downloadProgressNotificationHandler.stopped(resourceID, storeName, downloadManager));
    }
}