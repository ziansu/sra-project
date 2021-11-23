@java.lang.Override
public void configure(com.amadeus.session.SessionConfiguration conf) {
    super.configure(conf);
    httpOnly = java.lang.Boolean.valueOf(conf.getAttribute(com.amadeus.session.servlet.CookieSessionTracking.COOKIE_HTTP_ONLY_PARAMETER, "true"));
    secure = java.lang.Boolean.valueOf(conf.getAttribute(com.amadeus.session.servlet.CookieSessionTracking.SECURE_COOKIE_PARAMETER, "false"));
    contextPath = conf.getAttribute(com.amadeus.session.servlet.CookieSessionTracking.COOKIE_CONTEXT_PATH_PARAMETER, null);
}