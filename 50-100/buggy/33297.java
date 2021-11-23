public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> makeDir(java.lang.String path, int mode) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.MAKE_DIR), null);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.MAKE_DIR_MODE, mode);
    return this.client.postAsync(builder.build(), null);
}