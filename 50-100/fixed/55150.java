private void freeBuffer() {
    if ((currentBuffer) != null) {
        currentBuffer.close();
        currentBuffer = null;
        state = (state) & (~(io.undertow.conduits.DeflatingStreamSinkConduit.FLUSHING_BUFFER));
    }
    if ((deflater) != null) {
        pooledObject.close();
        deflater = null;
    }
}