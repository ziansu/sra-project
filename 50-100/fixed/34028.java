public static byte[] getBigEndianIntegerBytes(byte[] buffer, int start) {
    byte[] b = new byte[4];
    b[0] = buffer[(start + 3)];
    b[1] = buffer[(start + 2)];
    b[2] = buffer[(start + 1)];
    b[3] = buffer[start];
    return b;
}