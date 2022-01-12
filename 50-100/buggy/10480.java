@java.lang.Override
public boolean canConfirmOrderOfCart(io.muic.ooc.model.Cart cart) {
    java.util.Set<io.muic.ooc.model.CartProduct> cartProductSet = cartProductService.findCartProductsByCart(cart);
    if ((cartProductSet == null) || ((cartProductSet.size()) == 0)) {
        return false;
    }
    cart.setOrderConfirmed(true);
    cartRepository.save(cart);
    return true;
}