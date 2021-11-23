private static java.lang.String getUrl(javax.servlet.http.HttpServletRequest request) {
    java.lang.StringBuffer requestURL = request.getRequestURL();
    java.lang.String queryString = request.getQueryString();
    if (queryString != null) {
        requestURL.append('?').append(queryString);
    }
    return requestURL.toString();
}