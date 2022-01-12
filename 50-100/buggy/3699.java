public com.webstore.model.Product getProduct() {
    java.util.List<com.webstore.model.Product> pro = ((java.util.List<com.webstore.model.Product>) (com.webstore.model.Factory.getProducts().values()));
    for (com.webstore.model.Product p : pro) {
        if ((p.getId()) == (this.productId)) {
            this.product = p;
            break;
        }
    }
    return this.product;
}