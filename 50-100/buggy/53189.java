public void addToCart(com.codecool.shop.model.Product product, int quantity) {
    if (isProductInCart(product)) {
        java.lang.System.out.println("bejött");
        modifyItem(product, quantity);
    }else {
        lineItem.add(new com.codecool.shop.model.LineItem(product, quantity, product.getDefaultPrice()));
    }
}