@io.reactivex.subscribers.Test
public void assertNeverAtNotMatchingValue() {
    io.reactivex.subscribers.Flowable<java.lang.Integer> oi = io.reactivex.subscribers.Flowable.fromIterable(java.util.Arrays.asList(1, 2));
    io.reactivex.subscribers.TestSubscriber<java.lang.Integer> o = new io.reactivex.subscribers.TestSubscriber();
    oi.subscribe(o);
    o.assertNever(3);
    o.assertValueCount(2);
    o.assertTerminated();
}