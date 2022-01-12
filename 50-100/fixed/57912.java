public void delete(java.lang.String endpoint) throws com.ringcentral.RestException, java.io.IOException {
    com.ringcentral.Request request = new com.ringcentral.Request.Builder().url(((server) + endpoint)).addHeader("Authorization", authorizationHeader()).delete().build();
    request(request);
}