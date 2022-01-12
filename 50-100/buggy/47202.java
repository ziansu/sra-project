private void initCookie(final javax.servlet.http.Cookie cookie, final javax.servlet.http.HttpServletRequest req) {
    final java.lang.String context = req.getContextPath();
    cookie.setPath((null == context ? "/" : context));
    if ((maxAge) != null) {
        cookie.setMaxAge(java.lang.Integer.parseInt(maxAge));
    }
}