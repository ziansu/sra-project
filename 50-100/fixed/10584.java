public boolean tryReadLockWithCondition(V expected) {
    int[] stamp = new int[1];
    V value;
    do {
        value = lock.get(stamp);
        if ((expected != value) && ((value == null) || (!(expected.equals(value))))) {
            return false;
        }
    } while (lock.compareAndSet(value, value, stamp[0], ((stamp[0]) + 2)) );
    return true;
}