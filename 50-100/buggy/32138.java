@java.lang.Override
public void request(long l) {
    if (terminated) {
        throw new java.lang.IllegalStateException("The subscription is terminated");
    }
    if (l <= 0) {
        subscriber.onError(new java.lang.IllegalArgumentException("3.9"));
    }else {
        subscriber.onNext(item);
        subscriber.onComplete();
    }
    terminated = true;
}