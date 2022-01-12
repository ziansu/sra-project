private static short[] toShortArray(byte[] address) {
    short[] ret = new short[8];
    for (int i = 0, j = 0; i < 8; i++) {
        ret[i] = ((short) (((address[j]) << 8) + ((address[(j + 1)]) & 255)));
        j += 2;
    }
    return ret;
}