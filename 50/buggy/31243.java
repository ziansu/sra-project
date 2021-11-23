public void setKey(java.nio.channels.SelectionKey key) {
    this.key = key;
    synchronized(this) {
        notifyAll();
    }
}