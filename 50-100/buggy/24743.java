public void terminate() {
    this.terminated = true;
    synchronized(this.mutex) {
        this.mutex.notifyAll();
    }
    while (!(this.queue.isEmpty())) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException ex) {
        }
    } 
}