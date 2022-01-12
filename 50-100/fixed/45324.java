@java.lang.Override
public synchronized net.viktorc.detroid.framework.uci.SearchResults get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    long timeoutMs = unit.toMillis(timeout);
    long start = java.lang.System.currentTimeMillis();
    while ((!(isDone)) && (timeoutMs > 0)) {
        wait(timeoutMs);
        timeoutMs -= (java.lang.System.currentTimeMillis()) - start;
    } 
    return results;
}