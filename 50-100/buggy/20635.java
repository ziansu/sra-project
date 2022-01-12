java.lang.CharSequence value(final java.lang.CharSequence haystack, final int i) {
    if (!(match)) {
        throw new java.lang.IllegalStateException("not matched");
    }
    if (i > (captured)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return haystack.subSequence(start[i], end[i]);
}