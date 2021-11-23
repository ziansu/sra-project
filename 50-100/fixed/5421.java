@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest httpRequest = ((javax.servlet.http.HttpServletRequest) (request));
    if ("POST".equals(httpRequest.getMethod())) {
        chain.doFilter(request, response);
    }else {
        nestedFilter.doFilter(httpRequest, response, chain);
    }
}