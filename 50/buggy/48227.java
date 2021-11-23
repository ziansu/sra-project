public java.lang.String showProducts() {
    return productController.listProducts(orderController.getOrder());
}