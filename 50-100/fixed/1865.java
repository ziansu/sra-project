@io.reactivex.subscribers.Test
public void assertNeverAtNotMatchingPredicate() {
    io.reactivex.subscribers.TestSubscriber<java.lang.Integer> ts = new io.reactivex.subscribers.TestSubscriber<java.lang.Integer>();
    io.reactivex.subscribers.Flowable.just(2, 3).subscribe(ts);
    ts.assertNever(new io.reactivex.subscribers.Predicate<java.lang.Integer>() {
        @java.lang.Override
        public boolean test(final java.lang.Integer o) throws java.lang.Exception {
            return o == 1;
        }
    });
}