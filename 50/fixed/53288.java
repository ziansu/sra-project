public void close() {
    if (running) {
        running = false;
        ct.close();
        ct.interrupt();
    }
}