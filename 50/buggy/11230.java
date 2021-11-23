public javax.servlet.http.HttpServletResponse wrapResponse(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    return new org.egov.infra.config.session.CookieHttpSessionStrategy.MultiSessionHttpServletResponse(response, request);
}