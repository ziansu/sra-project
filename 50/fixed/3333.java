@java.lang.Override
public void incrementSourceCounter(final java.lang.String counterName, final long value) {
    final java.util.concurrent.atomic.AtomicLong previous = sourceCounters.putIfAbsent(counterName, new java.util.concurrent.atomic.AtomicLong(value));
    if (previous != null) {
        previous.addAndGet(value);
    }
}