private void postConvertSRGB(final short[] inPixels, final byte[] outPixels, final int begin, final int end) {
    int q = begin;
    for (int p = begin; p < end;) {
        outPixels[(q++)] = org.digitalmodular.imageutilities.resize.ImageResamplerShort.SHORT_TO_BYTE_SRGB[((inPixels[(p++)]) & 65535)];
    }
}