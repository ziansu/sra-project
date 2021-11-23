@org.jetbrains.annotations.NotNull
public static java.lang.String escapeChar(@org.jetbrains.annotations.NotNull
final java.lang.String string, final char toEscape) {
    final java.lang.String toEscapeStr = java.lang.String.valueOf(toEscape);
    return string.replaceAll(("\\\\" + toEscapeStr), toEscapeStr).replaceAll(toEscapeStr, ("\\\\" + toEscapeStr));
}