@java.lang.Override
public void close() {
    executorService.shutdown();
    try {
        executorService.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.InterruptedException e) {
        fr.xephi.authme.ConsoleLogger.logException("Could not close executor service:", e);
    }
    cachedAuths.invalidateAll();
    source.close();
}