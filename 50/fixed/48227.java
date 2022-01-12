public java.lang.String showProducts() {
    orderController.showProducts();
    return productController.listProducts(orderController.getOrder());
}