public net.uncontended.precipice.metrics.IntervalIterator<T> reset(long nanoTime) {
    long diff = nanoTime - (startNanos);
    long absoluteSlot = diff / (nanosPerSlot);
    java.lang.System.out.println(absoluteSlot);
    long index = (1 + absoluteSlot) - (totalSlots);
    this.remainderNanos = diff % (nanosPerSlot);
    this.index = index;
    this.maxIndex = absoluteSlot;
    return this;
}