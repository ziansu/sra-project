private java.util.Map<java.lang.String, java.lang.String> getHeaders(javax.servlet.http.HttpServletRequest req) {
    java.util.Map<java.lang.String, java.lang.String> result = new java.util.HashMap<>();
    for (java.lang.String headerName : java.util.Collections.list(req.getHeaderNames())) {
        result.put(headerName, req.getHeader(headerName));
    }
    return result;
}