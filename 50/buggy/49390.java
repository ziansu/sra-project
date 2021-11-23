public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest r = ((javax.servlet.http.HttpServletRequest) (request));
    interceptor.call(r, response, chain);
}