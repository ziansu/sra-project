private void waitForClear() {
    synchronized(this) {
        (waiting)++;
        if ((waiting) == 1)
            notifyAll();
        
        while (!(proceed)) {
            try {
                wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
    }
}