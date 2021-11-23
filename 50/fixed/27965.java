public static java.lang.Throwable getCause(final java.lang.Exception ex) {
    java.lang.Throwable cause = ex;
    while ((cause.getCause()) != null) {
        cause = cause.getCause();
    } 
    return cause;
}