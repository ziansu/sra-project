public org.osgl.util.S.Buffer prepend(java.lang.StringBuffer sb) {
    if (sb == null)
        return appendNull();
    
    int len = sb.length();
    ensureCapacityInternal(((count) + len));
    java.lang.System.arraycopy(value, 0, value, len, count);
    sb.getChars(0, len, value, 0);
    count += len;
    return this;
}