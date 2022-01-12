public void initProductItems(com.dajia.domain.Product product) {
    if ((null == (product.productItems)) || ((product.productItems.size()) == 0)) {
        com.dajia.domain.ProductItem productItem = new com.dajia.domain.ProductItem();
        productItem.isActive = CommonUtils.ActiveStatus.YES.toString();
        productItem.productStatus = CommonUtils.ProductStatus.INVALID.getKey();
        productItem.product = product;
        product.productItems = new java.util.ArrayList<com.dajia.domain.ProductItem>();
        product.productItems.add(productItem);
        productRepo.save(product);
    }
}