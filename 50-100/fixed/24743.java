public void terminate() {
    while (!(this.queue.isEmpty())) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException ex) {
        }
    } 
    this.terminated = true;
    synchronized(this.mutex) {
        this.mutex.notifyAll();
    }
}