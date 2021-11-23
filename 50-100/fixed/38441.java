public static java.lang.String getCookieContent(java.lang.String name, javax.servlet.http.HttpServletRequest request) {
    java.lang.String value = "";
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    for (javax.servlet.http.Cookie cookie : cookies) {
        if (cookie.getName().equals(name)) {
            value = cookie.getValue();
        }
    }
    return value;
}