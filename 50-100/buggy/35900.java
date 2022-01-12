@java.lang.Override
public void release() {
    try {
        allocationLock.lock();
        (allocations)--;
        if ((markedClosed) && ((allocations) == 0)) {
            close();
        }
    } finally {
        allocationLock.unlock();
    }
}