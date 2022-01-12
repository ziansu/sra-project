@java.lang.Override
public void execute(final org.yes.cart.shoppingcart.MutableShoppingCart shoppingCart, final java.util.Map<java.lang.String, java.lang.Object> parameters) {
    if (parameters.containsKey(getCmdKey())) {
        shoppingCart.getShoppingContext().clearContext();
        shoppingCart.getOrderInfo().clearInfo();
        setCustomerOptions(shoppingCart);
        setTaxOptions(shoppingCart, null, null, null);
        if (shoppingCart.removeItemOffers()) {
            recalculate(shoppingCart);
        }
        markDirty(shoppingCart);
    }
}