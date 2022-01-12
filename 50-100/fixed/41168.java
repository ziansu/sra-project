@java.lang.Override
public long tryNext(int n) throws com.lmax.disruptor.InsufficientCapacityException {
    if (n < 1) {
        throw new java.lang.IllegalArgumentException("n must be > 0");
    }
    if (!(hasAvailableCapacity(n, true))) {
        throw InsufficientCapacityException.INSTANCE;
    }
    long nextSequence = this.nextValue += n;
    return nextSequence;
}