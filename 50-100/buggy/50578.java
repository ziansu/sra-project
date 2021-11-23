public void addToProductsAndQuantityHashMap(java.lang.String product, java.lang.String quantity) {
    if (productsAndQuantity.containsKey(product)) {
        int previousQuantity = ((java.lang.Integer) (productsAndQuantity.get(product)));
        productsAndQuantity.put(product, (previousQuantity + (java.lang.Integer.parseInt(quantity))));
    }else {
        productsAndQuantity.put(product, java.lang.Integer.parseInt(quantity));
    }
}