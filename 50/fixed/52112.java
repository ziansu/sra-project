@java.lang.Override
public void allocate() {
    allocationLock.lock();
    try {
        (allocations)++;
    } finally {
        allocationLock.unlock();
    }
}