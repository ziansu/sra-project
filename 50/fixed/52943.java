public java.lang.String doGetTextPlain(java.lang.String path) throws java.io.IOException {
    return request(path, "GET", null, MediaType.TEXT_PLAIN, null, false);
}