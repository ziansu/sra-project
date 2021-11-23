@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.setCharacterEncoding("UTF-8");
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    for (javax.servlet.http.Cookie cookie : cookies) {
        if (model.UserDAO.checkIfUserExist(cookie.getValue())) {
            request.getSession().setAttribute("login", cookie.getValue());
            response.sendRedirect("./list");
            return ;
        }
    }
    response.sendRedirect("./login.jsp");
}