@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    try {
        authenticate(((javax.servlet.http.HttpServletRequest) (request)));
        chain.doFilter(request, response);
    } catch (org.springframework.security.core.AuthenticationException e) {
        javax.servlet.http.HttpServletResponse httpResponse = ((javax.servlet.http.HttpServletResponse) (response));
        httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
    }
}