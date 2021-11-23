public void addUserInSession(javax.servlet.http.HttpServletRequest request, Account.Models.User user) {
    java.lang.String userIpAddress = getRequestIp(request);
    javax.servlet.http.HttpSession session = request.getSession(true);
    session.setAttribute(session.getId(), user);
}