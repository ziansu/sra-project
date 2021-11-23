private static int getReceiverID(byte[] datagramContents) {
    int start = Packet.RECEIVER_LENGTH;
    int end = start + (Packet.RECEIVER_LENGTH);
    byte[] receiverIdArray = new byte[Packet.RECEIVER_LENGTH];
    receiverIdArray = java.util.Arrays.copyOfRange(datagramContents, start, end);
    java.nio.ByteBuffer receiverIdByteBuffer = java.nio.ByteBuffer.wrap(receiverIdArray);
    int receiverID = receiverIdByteBuffer.getInt();
    return receiverID;
}