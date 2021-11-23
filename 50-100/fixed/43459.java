private java.lang.String getSecureHttpOnlyCookieHeader(java.lang.String key, java.lang.Object value) {
    uk.gov.dvsa.motr.web.cookie.CookieInSessionFilter.logger.info("getSecureHttpOnlyCookieHeader has isShouldClearCookies value of {}", this.motrSession.isShouldClearCookies());
    int maxAge = (this.motrSession.isShouldClearCookies()) ? 0 : javax.ws.rs.core.NewCookie.DEFAULT_MAX_AGE;
    javax.ws.rs.core.NewCookie newCookie = new javax.ws.rs.core.NewCookie(key, value.toString(), "/", "", 1, "", maxAge, null, true, true);
    uk.gov.dvsa.motr.web.cookie.CookieInSessionFilter.logger.info("NewCookie has value of {}", newCookie.toString());
    return newCookie.toString();
}