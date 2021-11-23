public synchronized boolean start() {
    if (running)
        return false;
    
    thread = new java.lang.Thread(this);
    running = true;
    thread.start();
    return true;
}