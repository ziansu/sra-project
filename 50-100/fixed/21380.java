public com.connectordb.client.Stream updateStream(java.lang.String path, com.connectordb.client.Stream stream) throws com.connectordb.client.RequestFailedException, java.lang.Exception {
    okhttp3.Response response = simplePut(path, gson.toJson(stream.updates));
    return gson.fromJson(response.body().string(), com.connectordb.client.Stream.class);
}