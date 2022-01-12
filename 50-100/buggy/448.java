private int finMidIndex(java.lang.String literal) {
    int startOffset = (prefix.length()) + 1;
    int endOffset = ((literal.length()) - (suffix.length())) - 1;
    int midIndex = literal.substring(startOffset, endOffset).indexOf(mid);
    if (midIndex >= 0) {
        return midIndex + startOffset;
    }
    return -1;
}