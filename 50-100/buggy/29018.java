public com.connectordb.client.User createUser(java.lang.String name, com.connectordb.client.User usr) throws com.connectordb.client.RequestFailedException, java.lang.Exception {
    okhttp3.Response response = simplePost(name, gson.toJson(usr.updates));
    return gson.fromJson(response.body().charStream(), com.connectordb.client.User.class);
}