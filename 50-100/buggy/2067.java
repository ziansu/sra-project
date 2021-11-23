public vo.ShoppingCart getCart() {
    java.lang.System.out.println(org.apache.struts2.ServletActionContext.getServletContext().getMajorVersion());
    javax.servlet.http.HttpSession session = interceptor.SessionManagement.getSession();
    vo.ShoppingCart cart = ((vo.ShoppingCart) (session.getAttribute(action.CartAction.CART)));
    if (cart == null) {
        cart = new vo.ShoppingCart();
        session.setAttribute(action.CartAction.CART, cart);
    }
    return cart;
}