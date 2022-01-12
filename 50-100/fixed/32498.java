public static final boolean isNippyCompressed(byte[] bts) {
    return ((((bts.length) > 3) && ((bts[0]) == 78)) && ((bts[1]) == 80)) && ((bts[2]) == 89);
}