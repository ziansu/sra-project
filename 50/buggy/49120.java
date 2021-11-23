public java.util.List<sitecreators.utils.product.Product> getProducts() {
    this.products = productDao.getProducts();
    return products;
}