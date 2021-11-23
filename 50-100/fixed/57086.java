private com.rdt.DataPacket makeDataPacket(long seqNo) {
    byte[] data = new byte[com.rdt.ConnectionHandler.CHUNK_SIZE];
    int actualLen;
    try {
        actualLen = fileStream.read(data);
    } catch (java.io.IOException e) {
        return null;
    }
    return new com.rdt.DataPacket(data, actualLen, seqNo, destPort, destIp);
}