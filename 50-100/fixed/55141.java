public boolean tryReadLock() {
    int[] stamp = new int[1];
    V value = lock.get(stamp);
    if ((stamp[0]) == 1) {
        return false;
    }
    return lock.compareAndSet(value, value, stamp[0], ((stamp[0]) + 2));
}