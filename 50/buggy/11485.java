private void ensureInitialized() {
    synchronized(initializationLock) {
        if (!(isInitialized)) {
            isInitialized = true;
            replayRequests(persistedState.getAllRequests());
        }
    }
}