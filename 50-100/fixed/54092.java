private void throwReportError(com.mediamath.terminalone.models.reporting.ReportError re) throws com.mediamath.terminalone.exceptions.ClientException {
    if (re != null) {
        java.lang.StringBuilder buffer = new java.lang.StringBuilder();
        parseErrorEntity(re, buffer);
        parseErrorStatus(re, buffer);
        throw new com.mediamath.terminalone.exceptions.ClientException(buffer.toString());
    }
}