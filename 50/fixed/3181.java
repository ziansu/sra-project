public synchronized void start() {
    if (isRunning) {
        return ;
    }
    this.isRunning = true;
    thread = new java.lang.Thread(this);
    thread.start();
}