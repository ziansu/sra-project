@java.lang.Override
public java.lang.String encode(site.kevindhu.model.UserMessage users) throws javax.websocket.EncodeException {
    javax.json.JsonArrayBuilder jsonArrayBuilder = javax.json.Json.createArrayBuilder();
    for (java.lang.String client : users.clients()) {
        jsonArrayBuilder.add(client);
    }
    return javax.json.Json.createObjectBuilder().add("type", "userMessage").add("userNames", jsonArrayBuilder).build().toString();
}