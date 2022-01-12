@java.lang.Override
public void operationComplete(final io.netty.util.concurrent.Future<java.lang.Object> f) throws java.lang.Exception {
    if (!(f.isSuccess())) {
        subscriber.onError(f.cause());
    }
}