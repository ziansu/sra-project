@java.lang.Override
public void run() {
    synchronized(this) {
        started = true;
        org.elasticsearch.common.util.concurrent.FutureUtils.cancel(timeoutFuture);
    }
    runAndClean(runnable);
}