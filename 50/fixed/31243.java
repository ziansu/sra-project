public void setKey(java.nio.channels.SelectionKey key) {
    synchronized(this) {
        this.key = key;
        notifyAll();
    }
}