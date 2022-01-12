@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    if ((req.getSession().getAttribute("loggedUser")) != null) {
        req.getSession().setAttribute("errorMessage", "Вы уже зарегистрированы");
        resp.sendRedirect("/");
        return ;
    }
    resp.setContentType("text/html;charset=utf-8");
    req.setCharacterEncoding("UTF-8");
    req.getRequestDispatcher(servlets.SignUpController.VIEW_JSP).forward(req, resp);
}