private void setupTimer() {
    if ((scheduledFuture) != null) {
        scheduledFuture.cancel(true);
    }
    if (((numOfMessages) > 1) && ((timeFrequency) > 0)) {
        if ((scheduledExecutorService) == null) {
            scheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        }
        scheduledTask();
    }else {
        if ((scheduledExecutorService) != null) {
            scheduledExecutorService.shutdown();
            scheduledExecutorService = null;
        }
    }
}