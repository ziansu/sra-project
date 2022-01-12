private java.lang.Long readTo(final long endOffset) {
    return endOffset < (offsetLimit) ? endOffset : offsetLimit;
}