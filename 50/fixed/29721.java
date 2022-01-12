@java.lang.Override
public final void stop() throws java.lang.Exception {
    pool.shutdownNow();
    pool.awaitTermination(1, java.util.concurrent.TimeUnit.SECONDS);
    if ((selfWal) != null) {
        selfWal.stop();
    }
    started = false;
}