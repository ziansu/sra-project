static final java.lang.Throwable findFirstOccurenceInExceptionChain(java.lang.Class<? extends java.lang.Throwable> type, java.lang.Throwable exception) {
    java.lang.Throwable cause = exception;
    while ((cause != null) && (type.isAssignableFrom(cause.getClass())))
        cause = exception.getCause();
    
    return cause;
}