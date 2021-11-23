public Account.Models.User getUserFromSession(javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null)
        return ((Account.Models.User) (session.getAttribute(session.getId())));
    
    return null;
}