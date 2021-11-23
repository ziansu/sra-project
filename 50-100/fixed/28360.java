public synchronized void init() {
    if (!(started)) {
        pool = java.util.concurrent.Executors.newFixedThreadPool(maxThreads);
        server = new nikoladasm.aspark.ASparkServer(latch, pool, ipAddress, port, routes, before, after, location, externalLocation, exceptionMap, webSockets, sslContext, serverName, mimeTypes);
        new java.lang.Thread(() -> {
            server.start();
        }).start();
        started = true;
    }
}