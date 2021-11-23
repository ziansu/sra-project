public java.lang.String[] getPurchasedProductNames() {
    java.lang.String[] array = new java.lang.String[purchasedProducts.size()];
    return purchasedProducts.keySet().toArray(array);
}