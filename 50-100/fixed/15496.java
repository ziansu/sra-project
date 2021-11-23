private void connect() {
    createEventSource();
    if (concurrentConnections) {
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                java.lang.Thread.sleep(sseThreadInterval);
                createEventSource();
            } catch (java.lang.InterruptedException ignored) {
            }
        });
    }
}