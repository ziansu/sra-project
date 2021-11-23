protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String url = "/login.jsp";
    javax.servlet.http.HttpSession session = request.getSession();
    session.invalidate();
    getServletContext().getRequestDispatcher(url).forward(request, response);
}