@java.lang.Override
public void enqueue(org.voltcore.utils.DeferredSerialization ds) {
    try {
        java.nio.ByteBuffer buf;
        synchronized(this) {
            buf = ds.serialize(java.nio.ByteBuffer.allocate(0));
        }
        if (buf == null) {
            throw new java.lang.UnsupportedOperationException();
        }
        enqueue(buf);
    } catch (java.io.IOException e) {
        org.voltdb.VoltDB.crashLocalVoltDB("enqueue() in SimpleClientResponseAdapter throw an exception", true, e);
    }
}