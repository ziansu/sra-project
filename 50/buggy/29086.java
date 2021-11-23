void reportResumed() {
    if ((downloadProgressNotificationHandler) != null) {
        sequentialTaskExecutor.submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                downloadProgressNotificationHandler.resumed(resourceID, storeName, downloadManager);
            }
        });
    }
}