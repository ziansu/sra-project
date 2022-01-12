private static int getMessageID(byte[] encryptedPayloadData) {
    int start = 0;
    int end = start + (EncryptedMessage.MESSAGE_ID_LENGTH);
    byte[] messageIdArray = new byte[EncryptedMessage.MESSAGE_ID_LENGTH];
    messageIdArray = java.util.Arrays.copyOfRange(encryptedPayloadData, start, end);
    java.nio.ByteBuffer messageIdByteBuffer = java.nio.ByteBuffer.wrap(messageIdArray);
    int messageID = messageIdByteBuffer.getShort();
    return messageID;
}