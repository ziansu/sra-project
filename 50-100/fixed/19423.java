public int itemsInCart() {
    cartItems = ((java.util.List<java.util.List<java.lang.String>>) (play.cache.Cache.get("cartdata")));
    if (((cartItems) != null) && ((cartItems.size()) > 0)) {
        return cartItems.size();
    }
    return 0;
}