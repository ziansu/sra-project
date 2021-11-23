@java.lang.Override
public void handleData(java.nio.ByteBuffer src, int startPosition, int endPosition) {
    final byte[] bytes = new byte[endPosition - startPosition];
    for (int i = 0; i < (bytes.length); i++) {
        bytes[i] = src.get((startPosition + i));
    }
    seenStrings.add(new java.lang.String(bytes, java.nio.charset.StandardCharsets.US_ASCII));
}