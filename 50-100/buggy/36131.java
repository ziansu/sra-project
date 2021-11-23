public static javax.servlet.http.Cookie getTokenCookie(javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    for (javax.servlet.http.Cookie cookie : cookies) {
        if (cookie.getName().equals(TokenUtil.TOKEN)) {
            return cookie;
        }
    }
    return null;
}