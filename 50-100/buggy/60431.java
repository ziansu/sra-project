protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession();
    javax.servlet.ServletContext context = request.getServletContext();
    helper.AccountManager manager = ((helper.AccountManager) (context.getAttribute(ContextStartupListener.ACCOUNT_MANEGER_ATTRIBUTE_NAME)));
    if (servlets.LoginServlet.isUserLogedIn(session, manager)) {
        javax.servlet.RequestDispatcher dispatch = request.getRequestDispatcher("Board.jsp");
        dispatch.forward(request, response);
    }else {
        response.sendRedirect("/ExamAssistant/Login");
    }
}