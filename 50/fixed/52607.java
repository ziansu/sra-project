private com.univocity.parsers.common.TextWritingException throwExceptionAndClose(java.lang.String message, java.lang.Object[] recordValues, java.lang.Throwable cause) {
    try {
        throw new com.univocity.parsers.common.TextWritingException(message, recordCount, recordValues, cause);
    } finally {
        try {
            close();
        } catch (java.lang.Throwable t) {
        }
    }
}