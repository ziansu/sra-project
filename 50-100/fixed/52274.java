@java.lang.Override
protected void successfulAuthentication(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain chain, org.springframework.security.core.Authentication authResult) throws java.io.IOException, javax.servlet.ServletException {
    org.springframework.security.core.context.SecurityContext context = org.springframework.security.core.context.SecurityContextHolder.createEmptyContext();
    context.setAuthentication(authResult);
    org.springframework.security.core.context.SecurityContextHolder.setContext(context);
    chain.doFilter(request, response);
}