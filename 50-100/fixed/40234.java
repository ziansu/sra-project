public static byte[] stereoByteArrayToMonoByteArray(byte[] stereoBytes) {
    byte[] monoBytes = new byte[(stereoBytes.length) / 2];
    for (int i = 0; i < (monoBytes.length); i += 2) {
        monoBytes[i] = stereoBytes[(2 * i)];
        monoBytes[(i + 1)] = stereoBytes[((2 * i) + 1)];
    }
    return monoBytes;
}