public synchronized void start() {
    if (this.isRunning) {
        return ;
    }
    thread = new java.lang.Thread(this);
    thread.start();
}