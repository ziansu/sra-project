public void registerSelectionKey(java.nio.channels.SelectionKey selectionKey) {
    java.io.OutputStream outputStream = new cs.colostate.edu.tcp.client.DataWritter(this);
    selectionKey.attach(outputStream);
    this.lock.lock();
    this.dataOutput = new java.io.DataOutputStream(outputStream);
    this.condition.signalAll();
    this.lock.unlock();
}