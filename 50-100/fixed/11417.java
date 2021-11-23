private void handleLogout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.http.Cookie myCookie) throws java.io.IOException, javax.servlet.ServletException {
    if (myCookie != null) {
        myCookie.setMaxAge(0);
        com.servlet.EnterServlet.sessionTable.remove(com.util.SessionUtil.getSessionId(myCookie.getValue()));
        response.addCookie(myCookie);
    }
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
    dispatcher.forward(request, response);
}