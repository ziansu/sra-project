@java.lang.Override
public void onFailure(java.lang.Throwable cause) {
    synchronized(this) {
        shutdownFuture.cancel(false);
    }
    shutdown.run();
}