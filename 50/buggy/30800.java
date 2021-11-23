public void start() {
    running = true;
    java.lang.Thread thread = new java.lang.Thread(this);
    thread.start();
}