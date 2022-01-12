public byte[] toByteArray() {
    byte[] lastByteOfConvertedMessageType = new byte[]{ com.google.common.primitives.Ints.toByteArray(messageType)[3] };
    if ((messagePayload) == null) {
        return com.google.common.primitives.Bytes.concat(com.google.common.primitives.Ints.toByteArray(1), lastByteOfConvertedMessageType);
    }
    byte[] messageLengthBytes = com.google.common.primitives.Ints.toByteArray(messageLength);
    return com.google.common.primitives.Bytes.concat(messageLengthBytes, lastByteOfConvertedMessageType, messagePayload);
}