@java.lang.Override
void txFailure(final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> execFuture, final long txId, final java.lang.Throwable cause) {
    futures.remove(execFuture);
    if ((failure) != null) {
        failure = cause;
    }
}