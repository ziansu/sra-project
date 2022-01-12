public void init(javax.servlet.FilterConfig fConfig) throws javax.servlet.ServletException {
    try {
        this.authenticateUrl = new java.net.URL(fConfig.getInitParameter("authenticateUrl"));
    } catch (java.net.MalformedURLException e) {
        uk.ac.ceda.authentication.filter.AuthenticateRedirectFilter.LOG.error(java.lang.String.format("URL, %s, was not a valid format.", this.authenticateUrl), e);
        this.authenticateUrl = null;
    }
    this.redirectQuery = fConfig.getInitParameter("redirectQuery");
    this.sessionCookieName = fConfig.getInitParameter("sessionCookieName");
    this.secretKey = fConfig.getInitParameter("secretKey");
}