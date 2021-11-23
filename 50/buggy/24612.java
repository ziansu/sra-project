public synchronized void start() {
    running = true;
    java.lang.Thread thread = new java.lang.Thread(this, "main");
    thread.start();
}