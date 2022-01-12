@java.lang.Override
public org.neo4j.driver.internal.packstream.PackOutput writeBytes(byte[] data, int offset, int length) throws java.io.IOException {
    while (offset < length) {
        ensure(1);
        int amountToWrite = java.lang.Math.min(buffer.remaining(), (length - offset));
        buffer.put(data, offset, amountToWrite);
        offset += amountToWrite;
    } 
    return this;
}