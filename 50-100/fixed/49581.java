public final reactor.core.test.TestSubscriber<T> awaitAndAssertValueCount(final long n) {
    reactor.core.test.TestSubscriber.await(valuesTimeout, new reactor.fn.Supplier<java.lang.String>() {
        @java.lang.Override
        public java.lang.String get() {
            return java.lang.String.format("%d out of %d next values received within %d secs", ((valueCount) - (nextValueAssertedCount)), n, valuesTimeout);
        }
    }, new reactor.fn.Supplier<java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean get() {
            return (valueCount) == ((nextValueAssertedCount) + n);
        }
    });
    nextValueAssertedCount += n;
    return this;
}