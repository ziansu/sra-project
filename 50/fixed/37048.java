public void shutdown() {
    this.manager.close();
    this.manager = null;
    this.isInitialized = false;
}