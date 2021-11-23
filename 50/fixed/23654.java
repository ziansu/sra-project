public com.connectordb.client.Device updateDevice(java.lang.String path, com.connectordb.client.Device device) throws com.connectordb.client.RequestFailedException, java.lang.Exception {
    okhttp3.Response response = simplePut(path, gson.toJson(device.updates));
    return gson.fromJson(response.body().string(), com.connectordb.client.Device.class);
}