public java.lang.String context(java.lang.String format) {
    if (((beginIndex) == 0) && ((endIndex) == 0)) {
        return baseURI;
    }
    return java.lang.String.format(format, baseURI, beginIndex, endIndex);
}