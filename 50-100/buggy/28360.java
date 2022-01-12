public synchronized void init() {
    if (!(started)) {
        pool = java.util.concurrent.Executors.newFixedThreadPool(maxThreads);
        new java.lang.Thread(() -> {
            server = new nikoladasm.aspark.ASparkServer(latch, pool, ipAddress, port, routes, before, after, location, externalLocation, exceptionMap, webSockets, sslContext, serverName, mimeTypes);
        }).start();
        started = true;
    }
}