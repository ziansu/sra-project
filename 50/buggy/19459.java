public synchronized void shutdown() {
    super.shutdown();
    exporter.interrupt();
}