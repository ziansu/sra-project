public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, java.io.IOException {
    javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (req));
    javax.servlet.http.HttpServletResponse response = ((javax.servlet.http.HttpServletResponse) (resp));
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session == null) {
        response.sendRedirect("./login.jsp");
    }else
        if ((session.getAttribute("userName")) == null) {
            response.sendRedirect("./login.jsp");
        }
    
    chain.doFilter(req, resp);
}