private org.pinae.zazu.server.handler.HandleResult checkRequest(javax.servlet.http.HttpServletRequest request) {
    java.lang.String[] headerNames = new java.lang.String[]{ "X-REQUEST-APP" , "X-REQUEST-TIME" };
    for (java.lang.String headerName : headerNames) {
        java.lang.String headerValue = request.getHeader(headerName);
        if (org.apache.commons.lang3.StringUtils.isEmpty(headerValue)) {
            return new org.pinae.zazu.server.handler.HandleResult(false, java.lang.String.format("%s is null", headerName));
        }
    }
    return new org.pinae.zazu.server.handler.HandleResult(true);
}