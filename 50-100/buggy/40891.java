@java.lang.Override
public void close() {
    client.close();
    sharedLocks.clear();
    exclusiveLocks.clear();
    if (initialized) {
        if (!(stopped)) {
            endLockSessionOnMaster(true);
            stopped = false;
        }
        initialized = false;
    }
}