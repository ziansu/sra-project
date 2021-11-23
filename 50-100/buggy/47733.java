public static packet parseUDPdata(byte[] UDPdata) throws java.lang.Exception {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(UDPdata);
    int type = buffer.getInt();
    int seqnum = buffer.getInt();
    int sent = buffer.getInt();
    int length = buffer.getInt();
    byte[] data = new byte[length];
    buffer.get(data, 0, length);
    return new packet(type, seqnum, sent, new java.lang.String(data));
}