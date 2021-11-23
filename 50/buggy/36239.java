public static <S> S createService(java.lang.Class<S> serviceClass, retrofit2.Converter.Factory factory, java.lang.String baseUrl, java.lang.String token) {
    return com.marcohc.architecture.data.net.ServiceGenerator.createService(serviceClass, factory, baseUrl, null, null, token);
}