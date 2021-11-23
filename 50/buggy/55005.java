@java.lang.Override
protected final void updateFlags(int flag, boolean value) {
    boolean locked = writeLock();
    try {
        updateFlagsNoLock(flag, value);
    } finally {
        writeUnlock(locked);
    }
}