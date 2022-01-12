public void close() {
    synchronized(this) {
        this.notifyAll();
    }
}