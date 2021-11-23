public java.lang.String getName() {
    Entitys.Product product = productService.findProductById(1);
    return product.getName();
}