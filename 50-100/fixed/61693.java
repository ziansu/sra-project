public void deleteItem(csc4700.Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    csc4700.CartItem cartItem = findCartItem(item);
    if (cartItem == null) {
        return ;
    }
    if ((cartItem.getCount()) == 1) {
        cartItems.remove(cartItem);
    }else {
        cartItem.decrementCountByOne();
    }
}