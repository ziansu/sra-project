public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> open(java.lang.String path, java.lang.String flag) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.OPEN), null);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.OPEN_FLAG, flag);
    return this.client.getAsync(builder.build());
}