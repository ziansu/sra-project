public static byte[] trimByteArray(byte[] buffer, int length) {
    byte[] trimmed = null;
    if (buffer != null) {
        trimmed = new byte[length];
        for (int i = 0; (i < (buffer.length)) && (i < length); i++) {
            trimmed[i] = buffer[i];
        }
    }
    return trimmed;
}