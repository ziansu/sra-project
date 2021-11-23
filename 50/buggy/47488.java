public boolean removeItem(java.lang.String code) {
    if (cart.containsKey(code)) {
        cart.remove(code);
        return true;
    }
    return false;
}