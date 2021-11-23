private void displayUserPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.http.Cookie newCookie, java.lang.String sessionId, java.lang.String cookieExpireTs) throws java.io.IOException, javax.servlet.ServletException {
    newCookie.setMaxAge(((com.servlet.EnterServlet.COOKIE_MAX_AGE) * 60));
    request.setAttribute("currentSessionId", sessionId);
    request.setAttribute("timeStamp", cookieExpireTs);
    response.addCookie(newCookie);
    request.setAttribute("cookieMsg", newCookie.getValue());
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
    dispatcher.forward(request, response);
}