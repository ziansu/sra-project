public boolean addItem(post.Store store, java.lang.String code, int number) {
    if (store.isInInventory(code.toUpperCase())) {
        cart.put(code.toUpperCase(), number);
        return true;
    }
    return false;
}