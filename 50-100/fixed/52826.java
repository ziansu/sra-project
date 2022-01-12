private static retrofit2.Retrofit getTokenAdapter() {
    okhttp3.OkHttpClient client = com.xsolla.android.sdk.api.XRestAdapter.getOkHttpBuilderWithTlsSupport().build();
    return new retrofit2.Retrofit.Builder().baseUrl(com.xsolla.android.sdk.api.XRestAdapter.BASE_URL_TOKEN).client(client).addCallAdapterFactory(retrofit2.adapter.rxjava.RxJavaCallAdapterFactory.create()).addConverterFactory(new com.xsolla.android.sdk.api.request.converter.XConverterFactory(new com.xsolla.android.sdk.api.model.additional.XToken())).build();
}