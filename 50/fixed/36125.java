private static void cookieWrite(javax.servlet.http.HttpServletResponse response, java.lang.String value) {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(mfi.photoexposition.util.ServletUtil.COOKIE_NAME, value);
    cookie.setMaxAge((((60 * 60) * 24) * 92));
    response.addCookie(cookie);
}