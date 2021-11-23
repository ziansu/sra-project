protected static void reportMessageHandlerProblem(java.lang.String name, java.lang.Class<?> cls, javax.ws.rs.core.MediaType ct, java.lang.Throwable ex) {
    java.lang.String errorMessage = org.apache.cxf.jaxrs.utils.JAXRSUtils.logMessageHandlerProblem(name, cls, ct);
    java.lang.Throwable actualEx = (ex instanceof org.apache.cxf.interceptor.Fault) ? ((org.apache.cxf.interceptor.Fault) (ex)).getCause() : ex;
    throw new javax.ws.rs.ProcessingException(errorMessage, actualEx);
}