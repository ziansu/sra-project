public void connect(org.glassfish.jersey.media.sse.EventListener listener, java.lang.String... names) {
    fintSseClient = new no.fint.sse.FintSseClient(listener, names);
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