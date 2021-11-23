private void writeStringValue(java.lang.String value) throws java.io.IOException {
    byte[] utf8Bytes = value.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    this.ensureCapacity((2 + (utf8Bytes.length)));
    this.writeShortValue(((short) (utf8Bytes.length)));
    this.buffer.put(utf8Bytes);
}