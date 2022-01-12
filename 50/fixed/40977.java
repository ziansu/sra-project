public java.lang.String doOption(java.lang.String path, java.lang.String accessToken) throws java.io.IOException {
    return request(path, "OPTIONS", null, MediaType.APPLICATION_JSON, accessToken, false);
}