public byte[] toByteArray() {
    byte[] lastByteOfConvertedMessageType = new byte[]{ com.google.common.primitives.Ints.toByteArray(messageType)[3] };
    byte[] lastByteOfMessageLength = new byte[]{ com.google.common.primitives.Ints.toByteArray(1)[3] };
    if ((messagePayload) == null) {
        return com.google.common.primitives.Bytes.concat(lastByteOfMessageLength, lastByteOfConvertedMessageType);
    }
    byte[] messageLengthBytes = com.google.common.primitives.Ints.toByteArray(messageLength);
    return com.google.common.primitives.Bytes.concat(messageLengthBytes, lastByteOfConvertedMessageType, messagePayload);
}