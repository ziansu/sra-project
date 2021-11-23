public boolean removeProduct(java.lang.Integer ref) {
    boolean result = false;
    if (productsInCart.containsKey(ref)) {
        productsInCart.remove(ref);
        result = true;
    }
    return result;
}