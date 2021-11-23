@java.lang.Override
public synchronized void onError(io.undertow.websockets.core.WebSocketChannel channel, T context, java.lang.Throwable throwable) {
    if (done) {
        throw new java.lang.IllegalStateException();
    }
    exception = throwable;
    if ((waiters) > 0) {
        notifyAll();
    }
}