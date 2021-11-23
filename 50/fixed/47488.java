public boolean removeItem(java.lang.String code) {
    if (cart.containsKey(code.toUpperCase())) {
        cart.remove(code);
        return true;
    }
    return false;
}