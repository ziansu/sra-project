public boolean status() {
    synchronized(status) {
        return status;
    }
}