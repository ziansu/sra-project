public int maxLen(final int ind) {
    if ((ind <= 0) || (ind > (alts.length)))
        return 0;
    
    return java.lang.Math.max(referenceAlleleLength, alts[(ind - 1)].getSeq().length());
}