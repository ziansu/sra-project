public void addToCart(com.codecool.shop.model.Product product, int quantity) {
    if (isProductInCart(product)) {
        modifyItem(product, quantity);
    }else {
        lineItem.add(new com.codecool.shop.model.LineItem(product, quantity, product.getDefaultPrice()));
    }
}