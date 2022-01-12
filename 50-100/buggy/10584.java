public boolean tryReadLockWithCondition(V expected) {
    int[] stamp = new int[1];
    V value = lock.get(stamp);
    return lock.compareAndSet(expected, expected, stamp[0], ((stamp[0]) + 2));
}