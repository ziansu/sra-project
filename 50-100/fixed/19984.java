protected java.lang.String getCookieValue(javax.servlet.http.HttpServletRequest req, java.lang.String cookieName) {
    javax.servlet.http.Cookie[] cookies = req.getCookies();
    if (cookies != null) {
        for (javax.servlet.http.Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
    }
    com.example.managedvms.gettingstartedjava.util.DatastoreSessionFilter.logger.log(java.util.logging.Level.WARNING, (("Cookie with name " + cookieName) + " was not found."));
    return "";
}