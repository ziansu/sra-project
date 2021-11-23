@org.junit.Test(timeout = 2000)
public void testUnsubscribeFromSynchronousInfiniteObservable() {
    final java.util.concurrent.atomic.AtomicLong count = new java.util.concurrent.atomic.AtomicLong();
    rx.internal.operators.OperatorTakeTest.INFINITE_OBSERVABLE.take(10).subscribe(new rx.functions.Action1<java.lang.Long>() {
        @java.lang.Override
        public void call(java.lang.Long l) {
            count.set(l);
        }
    });
    assertEquals(10, count.get());
}