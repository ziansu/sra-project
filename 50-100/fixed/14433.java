private boolean validateUsername(java.lang.String username, javax.servlet.http.HttpServletRequest request) {
    if ((username == null) || (username.trim().isEmpty())) {
        return false;
    }else
        if ((request.getParameter("username").length()) < 3) {
            return false;
        }
    
    return true;
}