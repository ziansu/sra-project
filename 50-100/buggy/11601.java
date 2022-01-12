private void postConvert(final short[] inPixels, final byte[] outPixels, final int begin, final int end) {
    int q = begin;
    for (int p = begin; p < end;) {
        final short f = inPixels[(p++)];
        outPixels[(q++)] = (f <= (-16257)) ? 0 : f >= 16256 ? -1 : ((byte) ((f + 16384) >> 7));
    }
}