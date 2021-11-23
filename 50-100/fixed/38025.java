private static int getTypeIdentifier(byte[] datagramContents) {
    int start = ((Packet.SENDER_LENGTH) + (Packet.RECEIVER_LENGTH)) + (Packet.SEQUENCE_NUM_LENGTH);
    int end = start + (Packet.TYPE_LENGTH);
    byte[] typeIdentifierArray = new byte[Packet.SEQUENCE_NUM_LENGTH];
    typeIdentifierArray = java.util.Arrays.copyOfRange(datagramContents, start, end);
    java.nio.ByteBuffer typeIdentifierBuffer = java.nio.ByteBuffer.wrap(typeIdentifierArray);
    int typeIdentifier = typeIdentifierBuffer.get();
    return typeIdentifier;
}