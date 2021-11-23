public static java.lang.Throwable getRootCause(java.lang.Throwable t) {
    if (t == null) {
        return null;
    }
    java.lang.Throwable rootCause = t;
    java.lang.Throwable cause = rootCause.getCause();
    while ((cause != null) && (cause != rootCause)) {
        rootCause = cause;
        cause = cause.getCause();
    } 
    return rootCause;
}