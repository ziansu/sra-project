public void addCookie(org.eclipse.rdf4j.workbench.util.WorkbenchRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.String name, java.lang.String value) {
    final javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(name, value);
    if (null == (req.getContextPath())) {
        cookie.setPath("/");
    }else {
        cookie.setPath(req.getContextPath());
    }
    cookie.setMaxAge(java.lang.Integer.parseInt(config.getInitParameter(org.eclipse.rdf4j.workbench.util.CookieHandler.COOKIE_AGE_PARAM)));
    this.addCookie(req, resp, cookie);
}