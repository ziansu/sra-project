public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse res, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletResponse response = ((javax.servlet.http.HttpServletResponse) (res));
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
    chain.doFilter(req, res);
}