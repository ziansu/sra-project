private void addTokenInCookie(java.lang.String token, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("token", token);
    cookie.setPath("/");
    if ("https".equals(request.getScheme())) {
        cookie.setSecure(true);
    }
    cookie.setHttpOnly(true);
    response.addCookie(cookie);
}