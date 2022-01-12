private void preConvert(byte[] inPixels, short[] outPixels, int begin, int end) {
    int q = begin;
    int p = begin;
    while (p < end)
        outPixels[(q++)] = ((short) ((((inPixels[(p++)]) & 255) << 7) - 16384));
    
}