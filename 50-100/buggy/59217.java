public de.timmyrs.suprdiscordbot.structures.Channel deleteMessages(java.lang.String[] ids) {
    com.google.gson.JsonArray snowflakes = new com.google.gson.JsonArray();
    for (java.lang.String id : ids) {
        snowflakes.add(new com.google.gson.JsonPrimitive(id));
    }
    com.google.gson.JsonObject json = new com.google.gson.JsonObject();
    json.add("messages", snowflakes);
    de.timmyrs.suprdiscordbot.apis.DiscordAPI.request("POST", (("/channels/" + (id)) + "/messages/bulk-delete"), json.toString());
    return this;
}