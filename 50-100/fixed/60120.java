public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> extendTtl(java.lang.String path, hsyndicate.rest.datatypes.FileDescriptor fi) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.EXTEND_TTL));
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.EXTEND_TTL_FD, fi.getFd());
    return this.client.postAsync(builder.build(), null);
}