private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
    doReadObject(stream);
    copied = new java.util.HashMap<>();
    pointersToContexts = com.google.common.collect.HashBasedTable.create();
    ref = new java.lang.ref.WeakReference<org.nd4j.linalg.api.buffer.DataBuffer>(this, org.nd4j.linalg.factory.Nd4j.bufferRefQueue());
    freed = new java.util.concurrent.atomic.AtomicBoolean(false);
}