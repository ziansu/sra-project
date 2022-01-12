static com.stnetix.ariaddna.externalcloudapi.implementation.Request getRequest(com.stnetix.ariaddna.externalcloudapi.implementation.HttpUrl url, java.lang.String token) {
    return com.stnetix.ariaddna.externalcloudapi.implementation.YandexDiskHelper.baseRequest.newBuilder().url(url).header("Authorization", ("OAuth " + token)).get().tag(null).build();
}