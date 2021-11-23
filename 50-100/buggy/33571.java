private static java.lang.StringBuilder appendOnlyOnce(final java.lang.StringBuilder builder, final char value) {
    return ((builder.length()) > 0) && ((builder.charAt(((builder.length()) - 1))) != value) ? builder.append(value) : builder;
}