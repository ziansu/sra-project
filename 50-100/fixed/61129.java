public static com.rewedigital.examples.msintegration.productinformation.product.ProductEntity of(final com.rewedigital.examples.msintegration.productinformation.product.Product product) {
    com.rewedigital.examples.msintegration.productinformation.product.ProductEntity productEntity = new com.rewedigital.examples.msintegration.productinformation.product.ProductEntity();
    productEntity.name = product.getName();
    productEntity.vendor = product.getVendor();
    productEntity.price = product.getPrice();
    productEntity.description = product.getDescription();
    productEntity.productNumber = product.getProductNumber();
    productEntity.image = product.getImage();
    productEntity.version = product.getVersion();
    return productEntity;
}