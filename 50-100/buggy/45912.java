private static byte[] retrieveOutputBuffer(int utfCount) {
    byte[] utfBytes = org.apache.cassandra.io.util.AbstractDataOutputStreamAndChannelPlus.utfBytesLocal.get();
    if ((utfBytes == null) || ((utfBytes.length) < utfCount)) {
        utfBytes = new byte[java.lang.Math.min(org.apache.cassandra.io.util.AbstractDataOutputStreamAndChannelPlus.MAX_BUFFER_SIZE, (utfCount * 2))];
        org.apache.cassandra.io.util.AbstractDataOutputStreamAndChannelPlus.utfBytesLocal.set(utfBytes);
    }
    return utfBytes;
}