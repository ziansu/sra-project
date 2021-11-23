public static void writeBooksIntoCookie(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, long bookId, int previousQuantity) {
    com.tsystems.javaschool.view.controllers.CartController.deleteExistingCookies(bookId, req);
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(java.lang.String.valueOf(bookId), (((((req.getSession().getAttribute("name_for_greeting")) + "dlm") + bookId) + "dlm") + (++previousQuantity)));
    cookie.setMaxAge((((60 * 60) * 24) * 30));
    resp.addCookie(cookie);
}