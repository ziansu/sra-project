public static java.nio.ByteBuffer s2bb(java.lang.String string) {
    if (string == null) {
        return null;
    }
    byte[] stringBytes = string.getBytes(org.puimula.libvoikko.ByteArray.UTF8);
    java.nio.ByteBuffer allBytes = java.nio.ByteBuffer.allocateDirect(((stringBytes.length) + 1));
    allBytes.position(0);
    allBytes.put(stringBytes);
    return allBytes;
}