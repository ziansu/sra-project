public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> close(java.lang.String path, hsyndicate.rest.datatypes.FileDescriptor fi) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.CLOSE));
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.CLOSE_FD, fi.getFd());
    return this.client.deleteAsync(builder.build());
}