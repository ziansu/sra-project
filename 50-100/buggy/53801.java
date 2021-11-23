public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> setXattr(java.lang.String path, java.lang.String key, java.lang.String value) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.SET_XATTR), null);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.SET_XATTR_KEY, key);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.SET_XATTR_VALUE, value);
    return this.client.postAsync(builder.build(), null);
}