static final java.lang.Throwable findFirstOccurenceInExceptionChain(java.lang.String typeName, java.lang.Throwable exception) {
    java.lang.Throwable cause = exception;
    while ((cause != null) && (typeName.equals(cause.getClass().getName())))
        cause = exception.getCause();
    
    return cause;
}