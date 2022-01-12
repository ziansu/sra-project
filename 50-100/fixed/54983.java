public java.lang.String post(java.lang.String endpoint, com.ringcentral.FormBody formBody) throws com.ringcentral.RestException, java.io.IOException {
    com.ringcentral.Request request = new com.ringcentral.Request.Builder().url(((server) + endpoint)).addHeader("Authorization", authorizationHeader()).post(formBody).build();
    return request(request);
}