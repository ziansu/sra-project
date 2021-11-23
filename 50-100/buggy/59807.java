private static short[] toShortArray(byte[] address) {
    short[] ret = new short[8];
    for (int i = 0, j = 0; i < 16; i++) {
        ret[i] = ((short) (((address[j]) << 8) + ((address[(j + 1)]) & 255)));
        j += 2;
    }
    return ret;
}