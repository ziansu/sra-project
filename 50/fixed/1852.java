public void clear() {
    synchronized(this) {
        buffer.clear();
    }
}