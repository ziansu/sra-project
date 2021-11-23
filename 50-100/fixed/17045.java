public void init(javax.servlet.FilterConfig fConfig) throws javax.servlet.ServletException {
    java.lang.String authenticateUrl = fConfig.getInitParameter("authenticateUrl");
    try {
        this.authenticateUrl = new java.net.URL(authenticateUrl);
    } catch (java.net.MalformedURLException e) {
        uk.ac.ceda.authentication.filter.AuthenticateRedirectFilter.LOG.error(java.lang.String.format("URL, %s, was not a valid format.", authenticateUrl), e);
        this.authenticateUrl = null;
    }
    this.redirectQuery = fConfig.getInitParameter("redirectQuery");
    this.sessionCookieName = fConfig.getInitParameter("sessionCookieName");
    this.secretKey = fConfig.getInitParameter("secretKey");
}