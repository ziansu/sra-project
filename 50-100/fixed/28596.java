public synchronized byte[] readBytes() throws java.io.IOException {
    final int dataLength = dataInputStream.readInt();
    final byte[] data = new byte[dataLength];
    final int dataRead = dataInputStream.read(data, 0, dataLength);
    if (dataRead != dataLength)
        throw new java.io.IOException("Not enough data available");
    
    return data;
}