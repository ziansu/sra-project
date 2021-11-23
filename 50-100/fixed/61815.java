protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession();
    java.lang.String forwardTo = "/index.jsp";
    session.invalidate();
    forwardTo = "/login.jsp";
    request.getRequestDispatcher(forwardTo).forward(request, response);
}