void clearLockStore(com.hazelcast.spi.ObjectNamespace namespace) {
    com.hazelcast.concurrent.lock.LockStoreImpl lockStore = lockStores.remove(namespace);
    if (lockStore != null) {
        lockStore.clear();
    }
}