@java.lang.Deprecated
public synchronized boolean advanceBy(long interval) {
    return advanceBy(interval, java.util.concurrent.TimeUnit.MILLISECONDS);
}