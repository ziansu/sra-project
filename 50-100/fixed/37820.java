@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res, java.lang.Object o) throws java.lang.Exception {
    javax.servlet.http.HttpSession session = req.getSession();
    if ((session.getAttribute("user")) == null) {
        res.sendRedirect("/login");
        return false;
    }
    return true;
}