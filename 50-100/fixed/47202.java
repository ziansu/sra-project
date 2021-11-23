private void initCookie(final javax.servlet.http.Cookie cookie, final javax.servlet.http.HttpServletRequest req) {
    final java.lang.String context = req.getContextPath();
    cookie.setPath((context.isEmpty() ? "/" : context));
    if ((maxAge) != null) {
        cookie.setMaxAge(java.lang.Integer.parseInt(maxAge));
    }
}