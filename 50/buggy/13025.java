public com.google.code.magja.service.product.ProductMediaRemoteService getProductMediaRemoteService() {
    if ((productLinkRemoteService) == null) {
        productMediaRemoteService = new com.google.code.magja.service.product.ProductMediaRemoteServiceImpl(magentoClient);
    }
    return productMediaRemoteService;
}