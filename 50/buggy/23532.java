synchronized void stop() {
    sequentialTaskExecutor.shutdown();
    downloadProgressNotificationHandler = null;
}