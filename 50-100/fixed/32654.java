@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest req = ((javax.servlet.http.HttpServletRequest) (request));
    javax.servlet.http.HttpSession session = req.getSession();
    if ((session == null) || ((session.getAttribute(Constants.LOGIN_USER)) == null)) {
        ((javax.servlet.http.HttpServletResponse) (response)).sendRedirect(((req.getContextPath()) + "/login"));
    }else {
        chain.doFilter(request, response);
    }
}