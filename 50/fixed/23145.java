private void throwFailure(okhttp3.Response response) throws com.connectordb.client.RequestFailedException, java.io.IOException {
    if (!(response.isSuccessful())) {
        throw new com.connectordb.client.RequestFailedException(gson.fromJson(response.body().string(), com.connectordb.client.ErrorResponse.class));
    }
}