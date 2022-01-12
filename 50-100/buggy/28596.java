public synchronized void readBytes(final byte[] out) throws java.io.IOException {
    final int dataLength = dataInputStream.readInt();
    final int dataRead = dataInputStream.read(out, 0, dataLength);
    if (dataRead != dataLength)
        throw new java.io.IOException("Not enough data available");
    
}