@java.lang.Override
public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (req));
    javax.servlet.http.HttpSession session = request.getSession();
    try {
        prepareUserSession(session);
        prepareApplicationThreadLocal(session, request);
        chain.doFilter(request, resp);
    } finally {
        org.egov.infra.config.core.ApplicationThreadLocals.clearValues();
    }
}