public void shutdown() {
    this.shutdown = true;
    if ((this.executor) != null) {
        this.executor.shutdown();
    }
}