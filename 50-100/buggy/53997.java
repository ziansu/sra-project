private static com.google.gson.JsonObject getJSONEntityAsJsonObject(com.cloudant.http.HttpConnection connection, java.net.URI uri) {
    java.nio.charset.Charset charset = com.cloudant.tests.UnicodeTest.getPlainTextEntityCharset(connection, uri);
    java.io.InputStream stream;
    try {
        stream = connection.responseAsInputStream();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Error starting to read from " + uri), e);
    }
    java.io.Reader reader = new java.io.InputStreamReader(new java.io.BufferedInputStream(stream), charset);
    return com.cloudant.tests.UnicodeTest.JSON_PARSER.parse(reader).getAsJsonObject();
}