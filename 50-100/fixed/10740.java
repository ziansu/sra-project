public void NewCookie(javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("cartID", Managers.ShoppingCartHolder.getRandomID());
    response.addCookie(cookie);
    Managers.ShoppingCart cart = new Managers.ShoppingCart();
    Managers.ShoppingCartHolder.getInstance().AddCart(cart, cookie.getValue());
}