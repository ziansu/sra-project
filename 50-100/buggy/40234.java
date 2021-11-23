public static byte[] stereoByteArrayToMonoByteArray(byte[] stereoBytes) {
    byte[] monoBytes = new byte[(stereoBytes.length) / 2];
    for (int i = 0; i < (monoBytes.length); i++) {
        monoBytes[i] = stereoBytes[(2 * i)];
    }
    return monoBytes;
}