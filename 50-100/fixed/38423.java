public static <S> S getHttpsInstance(java.io.InputStream certificateInputStream, java.lang.String baseUrl, java.lang.Class<S> serviceClass, java.util.HashMap requestHeaderMap) {
    if ((onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService) == null) {
        onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService = new onslabs.kit.rxnetworx.RxNetworkServiceFactory(onslabs.kit.rxnetworx.RxNetworkClient.getHttpsRestAdapter(certificateInputStream, baseUrl, requestHeaderMap));
    }
    return onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService.getClient(serviceClass);
}