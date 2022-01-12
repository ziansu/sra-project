public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> rename(java.lang.String path, java.lang.String toPath) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.RENAME));
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.RENAME_TO, toPath);
    return this.client.postAsync(builder.build(), null);
}