private void checkAddressInCart(javax.servlet.http.HttpSession session) {
    rsvier.cart.Cart cart = ((rsvier.cart.Cart) (session.getAttribute("cart")));
    if ((cart.getDeliveryAdress()) == null) {
        cart.setDeliveryAdress(new rsvier.address.Address());
    }
}