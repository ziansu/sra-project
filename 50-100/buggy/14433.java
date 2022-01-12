private boolean validateUsername(java.lang.String username, javax.servlet.http.HttpServletRequest request) {
    if ((username.equals("")) || (username.trim().equals(""))) {
        return false;
    }else
        if ((request.getParameter("username").length()) < 3) {
            return false;
        }
    
    return true;
}