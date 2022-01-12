public void clear() {
    while (!(poolBusy.compareAndSet(false, true)));
    final java.util.concurrent.atomic.AtomicLong[] cts = new java.util.concurrent.atomic.AtomicLong[counters.length];
    for (int i = 0; i < (counters.length); i++) {
        cts[i] = new java.util.concurrent.atomic.AtomicLong();
    }
    counters = cts;
    poolBusy.set(true);
}