public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(filters.CookieFilter.COOKIE_NAME, "true");
    cookie.setPath("/browserprint/");
    cookie.setMaxAge((-1));
    ((javax.servlet.http.HttpServletResponse) (response)).addCookie(cookie);
    chain.doFilter(request, response);
}