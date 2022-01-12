public double visitShoppingCart(com.dev.design.shoppingcart.visitor.ShoppingCart shoppingCart) {
    java.lang.System.out.println("---- Shopping Cart Vistor Trace ----");
    double price = 0;
    for (int i = 0; i < (shoppingCart.getCartItems().size()); i++) {
        shoppingCart.getCartItems().get(i).accept(this);
    }
    return 0;
}