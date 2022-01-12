public void productSold(java.lang.Long productId, java.lang.Integer quantity) {
    com.dajia.domain.Product product = productRepo.findOne(productId);
    if (null != product) {
        if (null == (product.sold)) {
            product.sold = 0L;
        }
        product.sold += 1;
        product.stock -= 1;
        calcCurrentPrice(product);
    }
    productRepo.save(product);
}