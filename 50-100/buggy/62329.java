public java.lang.String put(java.lang.String endpoint, com.ringcentral.definitions.Base base) throws com.ringcentral.RestException, java.io.IOException {
    com.ringcentral.RequestBody body = com.ringcentral.RequestBody.create(com.ringcentral.RestClient.jsonMediaType, com.alibaba.fastjson.JSON.toJSONString(base));
    com.ringcentral.Request request = new com.ringcentral.Request.Builder().url((((server) + "/") + endpoint)).addHeader("Authorization", authorizationHeader()).put(body).build();
    return request(request);
}