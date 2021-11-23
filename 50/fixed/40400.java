public void debug(java.lang.String format, java.lang.Object... args) {
    if (debug) {
        debug(java.lang.String.format(format, args));
    }
}