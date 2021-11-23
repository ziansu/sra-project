@java.lang.Override
public void doFilter(com.twilio.sms2fa.application.filters.ServletRequest request, com.twilio.sms2fa.application.filters.ServletResponse response, com.twilio.sms2fa.application.filters.FilterChain chain) throws com.twilio.sms2fa.application.filters.ServletException, java.io.IOException {
    if (!(isAuthenticated(((javax.servlet.http.HttpServletRequest) (request))))) {
        ((javax.servlet.http.HttpServletResponse) (response)).sendRedirect(ExternalResource.SESSIONS_NEW.getPath());
    }
    chain.doFilter(request, response);
}