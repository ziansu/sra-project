public void registerSelectionKey(java.nio.channels.SelectionKey selectionKey) {
    java.io.OutputStream outputStream = new cs.colostate.edu.tcp.client.DataWritter(this);
    java.io.DataOutput dataOutput = new java.io.DataOutputStream(outputStream);
    selectionKey.attach(outputStream);
    this.lock.lock();
    this.freeDataOutputs.add(dataOutput);
    this.condition.signalAll();
    this.lock.unlock();
}