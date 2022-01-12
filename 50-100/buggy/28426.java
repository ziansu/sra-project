private retrofit2.Retrofit createRetrofit(de.sevenfactory.helium.config.Config inConfig, de.sevenfactory.helium.network.RequestSigner inSigner, de.sevenfactory.helium.TokenRepository inTokenRepository) {
    okhttp3.OkHttpClient client = createOkHttpClient();
    retrofit2.Retrofit.Builder builder = new retrofit2.Retrofit.Builder().baseUrl(inConfig.getEndpoint()).client(client).addConverterFactory(retrofit2.converter.jackson.JacksonConverterFactory.create(createObjectMapper()));
    doWithRetrofitBuilder(builder);
    return builder.build();
}