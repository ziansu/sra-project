public org.osgl.util.S.Buffer prepend(java.lang.StringBuilder sb) {
    if (sb == null)
        return prependNull();
    
    int len = sb.length();
    ensureCapacityInternal(((count) + len));
    java.lang.System.arraycopy(value, 0, value, count, count);
    sb.getChars(0, len, value, 0);
    count += len;
    return this;
}