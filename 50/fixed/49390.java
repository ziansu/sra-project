public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    interceptor.call(((javax.servlet.http.HttpServletRequest) (request)), response, chain);
}