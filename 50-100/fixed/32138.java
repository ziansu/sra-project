@java.lang.Override
public void request(long l) {
    if (terminated) {
        return ;
    }
    terminated = true;
    if (l <= 0) {
        subscriber.onError(new java.lang.IllegalArgumentException("3.9"));
    }else {
        subscriber.onNext(item);
        subscriber.onComplete();
    }
}