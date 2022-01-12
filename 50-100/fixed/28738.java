public void sendRedirect(javax.servlet.http.HttpServletResponse response, java.lang.String location) throws java.io.IOException, org.owasp.esapi.reference.AccessControlException {
    if (!(org.owasp.esapi.reference.ESAPI.validator().isValidRedirectLocation("Redirect", location, false))) {
        logger.fatal(Logger.SECURITY_FAILURE, ("Bad redirect location: " + location));
        throw new org.owasp.esapi.reference.AccessControlException("Redirect failed");
    }
    response.sendRedirect(location);
}