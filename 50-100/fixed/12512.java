private static int getSequenceNumber(byte[] datagramContents) {
    int start = (Packet.SENDER_LENGTH) + (Packet.RECEIVER_LENGTH);
    int end = start + (Packet.SEQUENCE_NUM_LENGTH);
    byte[] seqNumArray = new byte[Packet.SEQUENCE_NUM_LENGTH];
    seqNumArray = java.util.Arrays.copyOfRange(datagramContents, start, end);
    java.nio.ByteBuffer seqNumByteBuffer = java.nio.ByteBuffer.wrap(seqNumArray);
    int seqNum = seqNumByteBuffer.getShort();
    return seqNum;
}