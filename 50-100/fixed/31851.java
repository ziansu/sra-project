public com.thedeanda.javajson.JsonArray getConfig() {
    com.thedeanda.javajson.JsonArray arr = new com.thedeanda.javajson.JsonArray();
    for (com.thedeanda.javajson.JsonValue v : data) {
        arr.add(v.getJsonObject());
    }
    arr.remove(((arr.size()) - 1));
    return arr;
}