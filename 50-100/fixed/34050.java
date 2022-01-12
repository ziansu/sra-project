static final java.lang.Throwable findFirstOccurenceInExceptionChain(java.lang.String typeName, java.lang.Throwable exception) {
    java.lang.Throwable cause = exception;
    while (cause != null) {
        if (typeName.equals(cause.getClass().getName())) {
            return cause;
        }
        cause = cause.getCause();
    } 
    return null;
}