private com.google.gson.JsonElement parseResponse(java.io.InputStream response) throws java.io.IOException {
    java.io.Reader reader = new java.io.InputStreamReader(response, com.urswolfer.gerrit.client.rest.http.GerritRestClient.UTF_8);
    try {
        return new com.google.gson.JsonParser().parse(reader);
    } catch (com.google.gson.JsonSyntaxException jse) {
        throw new java.io.IOException(java.lang.String.format("Couldn't parse response: %n%s", com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(response))), jse);
    } finally {
        reader.close();
    }
}