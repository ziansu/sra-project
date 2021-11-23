public com.connectordb.client.Stream getStream(java.lang.String path) throws com.connectordb.client.RequestFailedException, java.lang.Exception {
    okhttp3.Response response = simpleGet(path);
    return gson.fromJson(response.body().charStream(), com.connectordb.client.Stream.class);
}