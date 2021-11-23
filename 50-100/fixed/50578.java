public void addToProductsAndQuantityHashMap(java.lang.String product, java.lang.String quantity) {
    if (productsAndQuantity.containsKey(product)) {
        int previousQuantity = java.lang.Integer.parseInt(productsAndQuantity.get(product));
        productsAndQuantity.put(product, (previousQuantity + quantity));
    }else {
        productsAndQuantity.put(product, quantity);
    }
}