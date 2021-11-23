@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest req = ((javax.servlet.http.HttpServletRequest) (request));
    boolean isLogined = false;
    if ((req.getCookies()) != null) {
        try {
            isLogined = validateCookie(getToken(req), request.getRemoteAddr());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    request.setAttribute("logined", isLogined);
    chain.doFilter(request, response);
}