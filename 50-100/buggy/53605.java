@java.lang.Override
public org.neo4j.driver.internal.packstream.PackOutput writeBytes(byte[] data, int offset, int length) throws java.io.IOException {
    int index = 0;
    while (index < length) {
        ensure(1);
        int amountToWrite = java.lang.Math.min(buffer.remaining(), (length - index));
        buffer.put(data, offset, amountToWrite);
        index += amountToWrite;
    } 
    return this;
}