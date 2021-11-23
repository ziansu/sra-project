public static java.lang.Object getService(java.lang.Class requestManagerInterface, retrofit.RestAdapter.Builder builder, java.util.Map<java.lang.String, java.lang.String> headers) {
    builder.setErrorHandler(new com.e16din.requestmanager.retrofit.StaticErrorHandler()).setRequestInterceptor(com.e16din.requestmanager.retrofit.RetrofitAdapter.getRequestInterceptor(headers));
    return builder.build().create(requestManagerInterface);
}