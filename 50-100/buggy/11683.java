private void checkProduct(java.lang.String developerId, java.lang.String productId) {
    com.umasuo.device.center.application.dto.ProductView product = restClient.getProduct(developerId, productId);
    if (developerId.equals(product.getDeveloperId())) {
        com.umasuo.device.center.application.service.UnionApplication.LOGGER.debug("Developer: {} don't own this product: {}.", developerId, productId);
        throw new com.umasuo.exception.AuthFailedException("Developer do not own this product");
    }
    if (!(ProductStatus.PUBLISHED.equals(product.getStatus()))) {
        com.umasuo.device.center.application.service.UnionApplication.LOGGER.debug("Product: {} is not published.", productId);
        throw new com.umasuo.exception.CreateResourceFailed("Product is not published");
    }
}