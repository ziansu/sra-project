@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Object arg2) throws java.lang.Exception {
    javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (req));
    ar.edu.itba.it.paw.UserManager userManager = new ar.edu.itba.it.paw.SessionUserManager(request);
    if (userManager.existsUser()) {
        request.setAttribute("user", userManager.getUser());
    }else {
        request.setAttribute("user", null);
    }
    return true;
}