@java.lang.Override
public org.neo4j.kernel.impl.transaction.log.WritableLogChannel put(byte[] value, int length) throws java.io.IOException {
    int offset = 0;
    while (offset < length) {
        int chunkSize = java.lang.Math.min((length - offset), ((buffer.capacity()) >> 1));
        bufferWithGuaranteedSpace(chunkSize).put(value, offset, chunkSize);
        offset += chunkSize;
    } 
    return this;
}