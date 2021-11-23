private static byte[] genXBytes(byte[] finalHash, int code) {
    byte[] x = fill(new byte[64], code);
    for (int i = 0; i < (finalHash.length); ++i) {
        x[i] ^= finalHash[i];
    }
    return x;
}