public synchronized void shutdown() {
    if ((_nearlineStorage) != null) {
        _nearlineStorage.shutdown();
    }
}