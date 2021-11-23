@java.lang.Override
public void close() {
    source.close();
    cachedAuths.invalidateAll();
    executorService.shutdown();
    try {
        executorService.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.InterruptedException e) {
        fr.xephi.authme.ConsoleLogger.logException("Could not close executor service:", e);
    }
}