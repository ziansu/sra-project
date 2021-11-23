public static com.linkedin.pinot.common.response.ProcessingException getException(com.linkedin.pinot.common.response.ProcessingException processingException, java.lang.Exception exception, int sizeOfStackTraceToTruncate) {
    com.linkedin.pinot.common.response.ProcessingException retProcessingException = com.linkedin.pinot.common.exception.QueryException.FUTURE_CALL_ERROR.deepCopy();
    java.io.StringWriter sw = new java.io.StringWriter(sizeOfStackTraceToTruncate);
    exception.printStackTrace(new java.io.PrintWriter(sw));
    retProcessingException.setMessage(sw.toString());
    return retProcessingException;
}