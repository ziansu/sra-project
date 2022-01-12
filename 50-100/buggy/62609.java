protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println(((models.User) (request.getSession().getAttribute("user"))).getEmail());
    if ((request.getSession().getAttribute("user")) != null) {
        request.getSession().invalidate();
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}