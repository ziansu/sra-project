public static long int64d(byte[] buf, int off) {
    long b = 0;
    for (int i = 0; i < 8; i++)
        b |= ((long) (haven.Utils.ub(buf[i]))) << (i * 8);
    
    return b;
}