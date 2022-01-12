public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletResponse res = ((javax.servlet.http.HttpServletResponse) (response));
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(header, java.lang.String.valueOf(new java.util.Date().getTime()));
    res.addCookie(cookie);
    chain.doFilter(request, res);
}