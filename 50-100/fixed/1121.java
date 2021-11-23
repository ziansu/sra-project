public int getFullMessageLength() {
    java.util.List<java.nio.ByteBuffer> fullMessageBody = getFullMessageBody();
    int size = ((int) (fullMessageBody.stream().mapToInt(( byteBuffer) -> byteBuffer.limit()).sum()));
    fullMessageBody.forEach(( byteBuffer) -> addMessageBody(byteBuffer));
    return size;
}