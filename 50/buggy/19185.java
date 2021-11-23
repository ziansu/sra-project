@java.lang.Override
public void operationComplete(final io.netty.util.concurrent.Future future) throws java.lang.Exception {
    if (!(future.isSuccess())) {
        subscriber.onError(future.cause());
    }
}