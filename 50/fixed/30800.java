public void start() {
    running = true;
    thread = new java.lang.Thread(this);
    thread.start();
}