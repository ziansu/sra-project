protected void doPost(servlets.HttpServletRequest request, servlets.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setContentType("application/json");
    java.lang.String userEmail = request.getParameter("email");
    java.lang.String password = request.getParameter("password");
    if ((userEmail == null) || (password == null)) {
        response.setStatus(400);
    }
    if (!(isValidUser(userEmail))) {
        response.setStatus(400);
    }
}