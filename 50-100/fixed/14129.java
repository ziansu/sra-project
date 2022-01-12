private org.apache.http.HttpRequest newProxyRequestWithEntity(java.lang.String method, java.lang.String proxyRequestUri, javax.servlet.http.HttpServletRequest servletRequest) throws java.io.IOException {
    org.apache.http.HttpEntityEnclosingRequest eProxyRequest = new org.apache.http.message.BasicHttpEntityEnclosingRequest(method, proxyRequestUri);
    eProxyRequest.setEntity(new org.apache.http.entity.InputStreamEntity(servletRequest.getInputStream(), getContentLength(servletRequest)));
    return eProxyRequest;
}