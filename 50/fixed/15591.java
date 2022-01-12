public void initializeWriting() throws java.io.IOException {
    if ((downloadProgressNotificationHandler) != null) {
        sequentialTaskExecutor.submit(() -> downloadProgressNotificationHandler.started(resourceID, storeName, downloadManager));
    }
}