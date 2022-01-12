public final void writeStringNoTag(java.lang.String value) throws java.io.IOException {
    final int oldPosition = position;
    try {
        int length = com.google.protobench.Utf8.encodeReverse(value, buffer, offset, spaceLeft());
        position -= length;
        writeUInt32NoTag(length);
    } catch (com.google.protobench.Utf8 e) {
        position = oldPosition;
        inefficientWriteStringNoTag(value);
    } catch (java.lang.IndexOutOfBoundsException e) {
        throw new com.google.protobench.OutOfSpaceException(e);
    }
}