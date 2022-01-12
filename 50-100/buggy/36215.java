public java.util.Map<java.lang.String, java.lang.String> getCookieMap(javax.servlet.http.HttpServletRequest request) {
    java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (javax.servlet.http.Cookie cookie : cookies) {
            map.put(cookie.getName(), cookie.getValue());
        }
    }
    return map;
}