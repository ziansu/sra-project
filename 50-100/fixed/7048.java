public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> write(java.lang.String path, hsyndicate.rest.datatypes.FileDescriptor fi, long offset, int len, byte[] buffer) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.WRITE));
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.WRITE_FD, fi.getFd());
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.WRITE_OFFSET, offset);
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.WRITE_LENGTH, len);
    return this.client.postAsync(builder.build(), buffer);
}