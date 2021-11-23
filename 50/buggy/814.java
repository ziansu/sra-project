protected void logWarning(int position, java.lang.String message) {
    boolean prev = log.multipleErrors;
    log.multipleErrors = isVerbose("errors");
    try {
        log.warning(position, "ceylon", message);
    } finally {
        log.multipleErrors = prev;
    }
}