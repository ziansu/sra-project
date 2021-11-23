private void postConvert(short[] inPixels, byte[] outPixels, int begin, int end) {
    int q = begin;
    int p = begin;
    while (p < end) {
        short f = inPixels[(p++)];
        outPixels[(q++)] = (f <= (-16257)) ? 0 : f >= 16256 ? -1 : ((byte) ((f + 16384) >> 7));
    } 
}