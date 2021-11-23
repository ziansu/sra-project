@java.lang.Override
public void onFailure(java.lang.Throwable cause) {
    shutdownFuture.cancel(false);
    shutdown.run();
}