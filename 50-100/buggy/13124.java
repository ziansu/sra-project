public java.lang.String getCurrentSessionAlias(javax.servlet.http.HttpServletRequest request) {
    if ((sessionParam) == null) {
        return org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS;
    }
    java.lang.String u = request.getParameter(sessionParam);
    if (u == null) {
        return org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS;
    }
    if (!(ALIAS_PATTERN.matcher(u).matches())) {
        return org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS;
    }
    return u;
}