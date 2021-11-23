public com.google.gson.JsonElement serialize(main.java.miro.validator.stats.types.RPKIRepositoryStats src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
    com.google.gson.JsonObject statsObj = new com.google.gson.JsonObject();
    statsObj.add("name", new com.google.gson.JsonPrimitive(src.getName()));
    statsObj.add("timestamp", new com.google.gson.JsonPrimitive(src.getTimestamp()));
    statsObj.add("trustAnchor", new com.google.gson.JsonPrimitive(src.getTrustAnchor()));
    statsObj.add("result", context.serialize(src.getResult()));
    return statsObj;
}