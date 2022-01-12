public long getValue() {
    synchronized(key) {
        return l;
    }
}