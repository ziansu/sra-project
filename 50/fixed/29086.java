synchronized void reportResumed() {
    if ((downloadProgressNotificationHandler) != null) {
        sequentialTaskExecutor.submit(() -> downloadProgressNotificationHandler.resumed(resourceID, storeName, downloadManager));
    }
}