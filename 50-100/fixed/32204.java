public static void setCookie(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String domain, int maxAge, java.lang.String name, java.lang.String value) {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(name, value);
    if (com.sunny.tool.CookieTool.isDomain(domain)) {
        cookie.setDomain(com.sunny.tool.CookieTool.getDomain(domain));
    }
    cookie.setPath(com.sunny.tool.CookieTool.PATH);
    cookie.setMaxAge(maxAge);
    response.addCookie(cookie);
}