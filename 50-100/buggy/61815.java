protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession();
    com.cggcoding.models.User user = ((com.cggcoding.models.User) (session.getAttribute("user")));
    java.lang.String forwardTo = "/index.jsp";
    java.lang.String requestedAction = request.getParameter("requestedAction");
    java.lang.String path = request.getParameter("path");
    request.setAttribute("path", path);
    session.invalidate();
    forwardTo = "/login.jsp";
    request.getRequestDispatcher(forwardTo).forward(request, response);
}