@java.lang.Override
public void onSubscribe(org.reactivestreams.Subscription subscription) {
    java.util.Objects.requireNonNull(subscription, "Subscription cannot be null");
    if (this.subscription.compareAndSet(null, subscription)) {
        checkExpectation(reactor.core.publisher.Signal.subscribe(subscription));
        if ((this.initialRequest) != 0L) {
            subscription.request(this.initialRequest);
        }
    }else {
        subscription.cancel();
    }
}