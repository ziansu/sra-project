public synchronized void start() {
    thread = new java.lang.Thread(this);
    thread.start();
    this.isRunning = true;
    this.run();
}