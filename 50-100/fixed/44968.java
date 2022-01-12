public static int[] toRegistersArray(byte[] src) {
    int[] dst = new int[(src.length) / 2];
    for (int i = 0, j = 0; i < (dst.length); i++ , j += 2)
        dst[i] = (((src[j]) & 255) << 8) | ((src[(j + 1)]) & 255);
    
    return dst;
}