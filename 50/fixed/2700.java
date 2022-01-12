protected java.lang.String getUserId(javax.servlet.http.HttpServletRequest request) {
    java.lang.Object attribute = request.getAttribute(attributeName);
    return attribute == null ? null : attribute.toString();
}