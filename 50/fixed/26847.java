@java.lang.Override
public net.uncontended.precipice.metrics.IntervalIterator<net.uncontended.precipice.metrics.PartitionedCount<T>> intervals(long nanoTime) {
    return buffer.intervals(nanoTime, noOpCounter);
}