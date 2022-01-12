private static long leRange(long lemin, long lemax) {
    if ((lemin < 0) && (lemax >= ((java.lang.Long.MAX_VALUE) + lemin)))
        return java.lang.Long.MAX_VALUE;
    
    long res = lemax - lemin;
    return res < 0 ? 0 : res;
}