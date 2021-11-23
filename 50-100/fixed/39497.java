public static com.linkedin.pinot.common.response.ProcessingException getException(com.linkedin.pinot.common.response.ProcessingException processingException, java.lang.Exception exception, int sizeOfStackTraceToTruncate) {
    com.linkedin.pinot.common.response.ProcessingException retProcessingException = processingException.deepCopy();
    java.io.StringWriter sw = new java.io.StringWriter(sizeOfStackTraceToTruncate);
    exception.printStackTrace(new java.io.PrintWriter(sw));
    retProcessingException.setMessage(sw.toString());
    return retProcessingException;
}