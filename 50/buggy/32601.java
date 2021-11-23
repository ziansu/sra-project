private java.lang.String getDescription(javax.servlet.http.HttpServletRequest request) {
    return (("[" + (request.getServletPath())) + ((request.getPathInfo()) == null ? "" : request.getPathInfo())) + "]";
}