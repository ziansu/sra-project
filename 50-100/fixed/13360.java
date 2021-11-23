public static <T> java.lang.String join(final T[] s, final java.lang.String delimiter) {
    if (s == null)
        return "";
    
    final java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    for (final T t : s) {
        if (((buffer.length()) > 0) && (delimiter != null)) {
            buffer.append(delimiter);
        }
        buffer.append(t.toString());
    }
    return buffer.toString();
}