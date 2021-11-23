@java.lang.Override
public net.viktorc.detroid.framework.uci.SearchResults get(long timeout, java.util.concurrent.TimeUnit unit) {
    long timeoutMs = unit.toMillis(timeout);
    long start = java.lang.System.currentTimeMillis();
    while ((!(isDone)) && (timeoutMs > 0)) {
        synchronized(this) {
            try {
                wait(timeoutMs);
                break;
            } catch (java.lang.InterruptedException e) {
                timeoutMs -= (java.lang.System.currentTimeMillis()) - start;
            }
        }
    } 
    return results;
}