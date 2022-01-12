@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession ses = request.getSession(false);
    if (ses == null)
        request.getRequestDispatcher("login.jsp").forward(request, response);
    else
        request.getRequestDispatcher("homepage.jsp").forward(request, response);
    
}