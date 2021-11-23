public void set(javax.servlet.http.HttpServletRequest request) {
    org.slf4j.MDC.put(getMDCKey(), getXRequestId(request));
}