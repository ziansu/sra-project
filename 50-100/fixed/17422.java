public java.util.concurrent.Future<com.sun.jersey.api.client.ClientResponse> updateTimes(java.lang.String path, long time) throws java.io.IOException {
    hsyndicate.rest.common.WebParamBuilder builder = new hsyndicate.rest.common.WebParamBuilder(path);
    builder.addParam(getAPI(hsyndicate.rest.client.SyndicateUGHttpClient.UPDATE_TIMES));
    builder.addParam(hsyndicate.rest.client.SyndicateUGHttpClient.UPDATE_TIMES_TIME, time);
    return this.client.postAsync(builder.build(), null);
}