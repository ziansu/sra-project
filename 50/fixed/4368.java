public com.google.gson.JsonObject getJsonObjectValue(java.lang.String key) {
    java.lang.String value = getValue(key);
    if (value == null)
        return null;
    else {
        com.google.gson.JsonObject data = new com.google.gson.JsonParser().parse(value).getAsJsonObject();
        return data;
    }
}