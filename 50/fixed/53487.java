public synchronized boolean contains(final java.lang.String sku) {
    return ((inventory) != null) && (inventory.hasPurchase(sku));
}