public void stop() {
    java.lang.Thread threadToStop;
    synchronized(this) {
        threadToStop = thread;
        thread = null;
    }
    if (threadToStop == null) {
        throw new java.lang.IllegalStateException("not running");
    }
    threadToStop.interrupt();
    while (true) {
        try {
            threadToStop.join();
            return ;
        } catch (java.lang.InterruptedException ignored) {
        }
    } 
}