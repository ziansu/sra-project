public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> removeXattr(java.lang.String path, java.lang.String key) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.REMOVE_XATTR), null);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.REMOVE_XATTR_KEY, key);
    return this.client.deleteAsync(builder.build());
}