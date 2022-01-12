public static int getSenderID(byte[] datagramContents) {
    int start = 0;
    int end = start + (Packet.SENDER_LENGTH);
    byte[] senderIdArray = new byte[Packet.SENDER_LENGTH];
    senderIdArray = java.util.Arrays.copyOfRange(datagramContents, start, end);
    java.nio.ByteBuffer senderIdByteBuffer = java.nio.ByteBuffer.wrap(senderIdArray);
    int senderID = senderIdByteBuffer.getInt();
    return senderID;
}