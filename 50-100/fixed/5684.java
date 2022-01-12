@java.lang.Override
protected void doFilterInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException {
    try {
        java.lang.String username = hello.TokenAuthUtil.validateToken(request);
    } catch (java.lang.Exception e) {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
        return ;
    }
    filterChain.doFilter(request, response);
}