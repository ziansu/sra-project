@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest req = ((javax.servlet.http.HttpServletRequest) (request));
    javax.servlet.http.HttpServletResponse resp = ((javax.servlet.http.HttpServletResponse) (response));
    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    if (processor(req, resp)) {
        chain.doFilter(request, response);
    }
}