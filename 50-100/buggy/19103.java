public static <T> java.lang.String join(final java.util.Collection<T> s, final java.lang.String delimiter) {
    if (s == null)
        return "";
    
    final java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    for (final T t : s) {
        if (((buffer.length()) > 0) && (delimiter != null)) {
            buffer.append(delimiter);
        }
        buffer.append(t.toString());
    }
    return buffer.toString();
}