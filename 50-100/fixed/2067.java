public vo.ShoppingCart getCart() {
    javax.servlet.http.HttpSession session = interceptor.SessionManagement.getSession();
    vo.ShoppingCart cart = ((vo.ShoppingCart) (session.getAttribute(action.CartAction.CART)));
    if (cart == null) {
        cart = new vo.ShoppingCart();
        session.setAttribute(action.CartAction.CART, cart);
    }
    return cart;
}