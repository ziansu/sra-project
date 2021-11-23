public static java.lang.String join(final java.lang.Iterable<java.lang.String> arguments, final java.lang.String delimiter) {
    final java.lang.StringBuilder buf = new java.lang.StringBuilder();
    if (arguments != null) {
        boolean first = true;
        for (final java.lang.String arg : arguments) {
            if (arg != null) {
                if (first) {
                    first = false;
                }else {
                    buf.append(delimiter);
                }
                buf.append(arg);
            }
        }
    }
    return buf.toString();
}