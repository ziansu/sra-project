private synchronized void start() {
    if (!(running)) {
        label.setEnabled(true);
        running = true;
        triedToCancel = false;
        thread = new java.lang.Thread(this, "Memory monitor");
        thread.start();
    }
}