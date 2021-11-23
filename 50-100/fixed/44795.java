private void postConvertSRGB(short[] inPixels, byte[] outPixels, int begin, int end) {
    int q = begin;
    int p = begin;
    while (p < end) {
        outPixels[(q++)] = org.digitalmodular.imageutilities.resize.ImageResamplerShort.SHORT_TO_BYTE_SRGB[((inPixels[(p++)]) & 65535)];
    } 
}