public com.google.code.magja.service.product.ProductMediaRemoteService getProductMediaRemoteService() {
    if ((productMediaRemoteService) == null) {
        productMediaRemoteService = new com.google.code.magja.service.product.ProductMediaRemoteServiceImpl(magentoClient);
    }
    return productMediaRemoteService;
}