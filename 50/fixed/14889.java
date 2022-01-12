public static retrofit2.Retrofit getClientPool(java.lang.String id) {
    return new retrofit2.Retrofit.Builder().baseUrl(tech.photoboard.photoboard.API.ApiClient.BASE_URL).addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create()).build();
}