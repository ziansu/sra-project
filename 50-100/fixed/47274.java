private T getClientCacheHolder(java.lang.String endpointId) {
    T client = initializedClients.get(endpointId);
    if (java.util.Objects.isNull(client)) {
        java.util.concurrent.locks.ReentrantLock lock = getLock(endpointId);
        lock.lock();
        try {
            client = initializedClients.get(endpointId);
            if (java.util.Objects.isNull(client)) {
                client = initializeClient(endpointId);
            }
        } finally {
            lock.unlock();
        }
    }
    return client;
}