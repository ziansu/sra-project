private java.lang.String getAuthCookie(javax.servlet.http.HttpServletRequest request) {
    try {
        java.lang.String cookieString = request.getHeader(HttpHeaders.SET_COOKIE);
        java.lang.String[] cookies = cookieString.split(";");
        for (java.lang.String value : cookies) {
            if (value.startsWith(WebConfig.COOKIE_NAME)) {
                return value.replace(((config.WebConfig.COOKIE_NAME) + "="), "");
            }
        }
    } catch (java.lang.Exception e) {
        log.error("getCookie Exception : {}", e.getMessage());
        e.printStackTrace();
    }
    return null;
}