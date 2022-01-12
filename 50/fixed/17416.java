public T take() throws java.lang.InterruptedException {
    synchronized(this) {
        while (isEmpty()) {
            wait();
        } 
        notify();
        return read();
    }
}