public boolean isMyRange(java.lang.Long v) {
    boolean result = ((leftRange) == v) || ((v >= (leftRange)) && (v < (rightRange)));
    return result;
}