public void shutdown() {
    manager.close();
    manager = null;
    isInitialized = false;
}