@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void call(final rx.Subscriber<java.lang.Object> subscriber) {
    subscriber.add(rx.subscriptions.Subscriptions.from(future.addListener(new io.netty.util.concurrent.GenericFutureListener<io.netty.util.concurrent.Future>() {
        @java.lang.Override
        public void operationComplete(final io.netty.util.concurrent.Future future) throws java.lang.Exception {
            if (!(future.isSuccess())) {
                subscriber.onError(future.cause());
            }
        }
    })));
}