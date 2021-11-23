public java.lang.String encode(site.kevindhu.model.UserMessage users) throws javax.websocket.EncodeException {
    javax.json.JsonObjectBuilder ret = javax.json.Json.createObjectBuilder().add("type", "userMessage");
    javax.json.JsonArrayBuilder jsonArrayBuilder = javax.json.Json.createArrayBuilder();
    for (java.lang.String client : users.clients()) {
        jsonArrayBuilder.add(client);
    }
    ret.add("userNames", jsonArrayBuilder);
    return ret.build().toString();
}