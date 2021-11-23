private void updateDirectories() {
    listenerLock.lock();
    try {
        registerDirWatchesRecursively();
        unregisterStaleDirWatches();
    } catch (java.lang.Exception ign) {
        de.interactive_instruments.exceptions.ExcUtils.suppress(ign);
    } finally {
        listenerLock.unlock();
    }
}