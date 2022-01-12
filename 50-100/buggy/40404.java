@java.lang.Override
public com.google.gson.JsonObject read(com.google.gson.stream.JsonReader in) throws java.io.IOException {
    com.google.gson.JsonElement jsonElement = com.vimeo.stag.KnownTypeAdapters.JsonElementTypeAdapter.readJsonElement(in);
    if ((null != jsonElement) && (!(jsonElement.isJsonObject()))) {
        throw new java.io.IOException("Could not parse it as a JsonObject");
    }
    return (null != jsonElement) && (jsonElement.isJsonArray()) ? jsonElement.getAsJsonObject() : null;
}