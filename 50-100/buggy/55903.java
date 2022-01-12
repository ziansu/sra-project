@java.lang.Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
    response.setContentType("text/html;charset=UTF-8");
    java.io.PrintWriter out = response.getWriter();
    java.lang.String email = request.getParameter("email");
    java.lang.String pass = request.getParameter("pass");
    if (Validate.checkUser(email, pass)) {
        response.sendRedirect("home.jsp");
    }else {
        out.println("Username or Password incorrect");
        response.sendRedirect("index.jsp?error=invalid");
    }
}