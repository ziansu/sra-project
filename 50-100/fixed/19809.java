public void update(java.lang.String cartId, com.emusicstore.model.Cart cart) {
    if (!(listOfCarts.containsKey(cartId))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(("Cannot update cart. " + "The cart doesn't exist"), cart.getCartId()));
    }
    listOfCarts.put(cartId, cart);
}