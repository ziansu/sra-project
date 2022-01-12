public static int[] toRegistersArray(byte[] src) {
    int[] dst = new int[(src.length) / 2];
    for (int i = 0; i < (dst.length); i++)
        dst[i] = (((src[i]) & 255) << 8) | ((src[(i + 1)]) & 255);
    
    return dst;
}