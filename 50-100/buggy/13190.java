public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> read(java.lang.String path, hsyndicate.rest.datatypes.FileDescriptor fi, long offset, int len) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.READ), null);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.READ_FD, fi.getFd());
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.READ_OFFSET, offset);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.READ_LENGTH, len);
    return this.client.downloadAsync(builder.build());
}