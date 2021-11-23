private java.nio.ByteBuffer buildPacket(byte extendedId, byte[] payload) {
    int length = (4 + 2) + (payload.length);
    java.nio.ByteBuffer ret = java.nio.ByteBuffer.allocate(length);
    ret.putInt((2 + (payload.length)));
    ret.put(com.killxdcj.jtorrent.peer.MetadataFetcher.EXTENDED);
    ret.put(extendedId);
    ret.put(payload);
    ret.flip();
    return ret;
}