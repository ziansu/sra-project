@java.lang.Override
public void init() {
    if ((storeSize) > _prevStoreSize)
        setStoreFileSize(storeSize);
    
    configLock.writeLock().lock();
    try {
        (generation)++;
        keyCount.set(0);
    } finally {
        configLock.writeLock().unlock();
    }
    org.tanukisoftware.wrapper.WrapperManager.signalStarting(((int) (((freenet.store.saltedhash.SaltedHashFreenetStore.Cleaner.RESIZE_MEMORY_ENTRIES) * (java.util.concurrent.TimeUnit.SECONDS.toMillis(30))) + (java.util.concurrent.TimeUnit.SECONDS.toMillis(1)))));
}