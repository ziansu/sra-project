public static final boolean isNippyCompressed(byte[] bts) {
    return (((((bts.length) > 4) && ((bts[0]) == 78)) && ((bts[1]) == 80)) && ((bts[2]) == 89)) && ((bts[3]) == 1);
}