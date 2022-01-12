public synchronized void put(java.lang.String message) {
    while (!(empty)) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
        }
    } 
    empty = false;
    this.message = message;
    notifyAll();
}