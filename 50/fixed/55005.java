@java.lang.Override
protected final void updateFlags(short flag, boolean value) {
    boolean locked = writeLock();
    try {
        updateFlagsNoLock(flag, value);
    } finally {
        writeUnlock(locked);
    }
}