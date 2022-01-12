public static java.lang.String getCookieContent(java.lang.String name, javax.servlet.http.HttpServletRequest request) {
    java.lang.String id = "";
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    for (javax.servlet.http.Cookie cookie : cookies) {
        if (cookie.getName().equals(name)) {
            id = cookie.getValue();
        }
    }
    return id;
}