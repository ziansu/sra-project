private void preConvert(byte[] inPixels, short[] outPixels, int begin, int end) {
    int q = begin;
    for (int p = begin; p < end; p++) {
        outPixels[(q++)] = ((short) ((((inPixels[p]) & 255) << 7) - 16384));
    }
}