public java.lang.String register(javax.json.JsonObject messageObject) {
    int id = this.bus.registerSender(messageObject.getString("sender_class"), messageObject.getString("sender_name"));
    javax.json.JsonObject response = javax.json.Json.createObjectBuilder().add("type", "register").add("sender_id", 1).add("ack", (id == (-1) ? ack_error(400) : ack_ok())).build();
    return response.toString();
}