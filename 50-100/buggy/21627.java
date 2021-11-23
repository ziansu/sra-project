@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler) throws java.lang.Exception {
    if (isInclude(request.getRequestURI())) {
        if (SessionManager.INSTANCE.isNotLogin(request.getSession())) {
            response.sendRedirect(com.hao.constants.Constants.LOGIN_URI);
            return false;
        }
        request.setAttribute(com.hao.constants.Constants.LOGIN_USER, SessionManager.INSTANCE.getLoginUser(request.getSession()));
    }
    return true;
}