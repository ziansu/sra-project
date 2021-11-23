private synchronized void start() {
    if (running)
        return ;
    
    running = true;
    thread = new java.lang.Thread(this);
    thread.start();
}