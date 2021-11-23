public static java.lang.String getServiceUrl(javax.servlet.http.HttpServletRequest request) {
    java.lang.String serviceURL = new opendap.dap.Request(null, request).getServiceUrl();
    java.lang.String relativeURL = opendap.coreServlet.ReqInfo.getLocalUrl(request);
    return opendap.PathBuilder.pathConcat(serviceURL, relativeURL);
}