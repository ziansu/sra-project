public static java.lang.String getServiceUrl(javax.servlet.http.HttpServletRequest request) {
    return new opendap.dap.Request(null, request).getServiceUrl();
}