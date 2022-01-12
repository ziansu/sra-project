public org.osgl.util.S.Buffer prepend(org.osgl.util.S.Buffer asb) {
    if (asb == null)
        return prependNull();
    
    int len = asb.length();
    ensureCapacityInternal(((count) + len));
    java.lang.System.arraycopy(value, 0, value, len, count);
    asb.getChars(0, len, value, 0);
    count += len;
    return this;
}