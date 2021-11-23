@java.lang.Override
public void call(final rx.Subscriber<java.lang.Object> subscriber) {
    subscriber.add(rx.subscriptions.Subscriptions.from(future.addListener(new io.netty.util.concurrent.GenericFutureListener<io.netty.util.concurrent.Future<java.lang.Object>>() {
        @java.lang.Override
        public void operationComplete(final io.netty.util.concurrent.Future<java.lang.Object> f) throws java.lang.Exception {
            if (!(f.isSuccess())) {
                subscriber.onError(f.cause());
            }
        }
    })));
}