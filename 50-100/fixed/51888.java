private javax.servlet.http.Cookie getCookie(javax.servlet.http.Cookie[] cookies, java.lang.String name, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(name, "");
    boolean found = false;
    if (cookies != null) {
        for (javax.servlet.http.Cookie ck : cookies) {
            if (ck.getName().equals(name)) {
                if (found) {
                    ck.setMaxAge(0);
                    response.addCookie(ck);
                }else {
                    cookie = ck;
                    found = true;
                }
            }
        }
    }
    return cookie;
}