@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Object obj) throws java.lang.Exception {
    if ((java.util.Objects.isNull(((beans.User) (req.getSession().getAttribute(interceptors.LoginCheckInterceptor.USER_SESSION_ATTRIBUTE_NAME))))) && (!(req.getServletPath().contains(interceptors.LoginCheckInterceptor.LOGIN_URL)))) {
        resp.sendRedirect(((req.getContextPath()) + (interceptors.LoginCheckInterceptor.LOGIN_URL)));
        return false;
    }
    return true;
}