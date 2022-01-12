public static <S> S getNewHttpsInstance(java.lang.String hostName, okhttp3.CertificatePinner certificatePinner, java.io.InputStream certificateInputStream, java.lang.String baseUrl, java.lang.Class<S> serviceClass, java.util.HashMap requestHeaderMap) {
    onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService = null;
    onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService = new onslabs.kit.rxnetworx.RxNetworkServiceFactory(onslabs.kit.rxnetworx.RxNetworkClient.getHttpsRestAdapter(hostName, certificatePinner, certificateInputStream, baseUrl, requestHeaderMap));
    return onslabs.kit.rxnetworx.RxNetworkServiceFactory.sDataService.getClient(serviceClass);
}