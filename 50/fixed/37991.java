public void shutdownPool() {
    synchronized(poolLock) {
        if ((executor) != null) {
            executor.shutdown();
            executor = null;
        }
    }
}