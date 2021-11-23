private void throwFailure(okhttp3.Response response) throws com.connectordb.client.RequestFailedException {
    if (!(response.isSuccessful())) {
        throw new com.connectordb.client.RequestFailedException(gson.fromJson(response.body().charStream(), com.connectordb.client.ErrorResponse.class));
    }
}