@org.jetbrains.annotations.NotNull
public static java.lang.String cleanupErrorPrefixes(@org.jetbrains.annotations.NotNull
java.lang.String msg) {
    final java.lang.String[] PREFIXES = new java.lang.String[]{ "fatal:" , "error:" };
    msg = msg.trim();
    for (java.lang.String prefix : PREFIXES) {
        if (msg.startsWith(prefix)) {
            return msg.substring(prefix.length()).trim();
        }
    }
    return msg;
}