public boolean removeProducts(java.lang.String productId, int count) {
    return getInventory().removeStock(productId, count);
}