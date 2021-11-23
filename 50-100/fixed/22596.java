public com.google.gson.JsonElement serialize(main.java.miro.validator.types.ResourceCertificateTree src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
    com.google.gson.JsonObject treeJson = new com.google.gson.JsonObject();
    treeJson.add("name", new com.google.gson.JsonPrimitive(src.getName()));
    treeJson.add("date", new com.google.gson.JsonPrimitive(src.getTimeStamp().toString()));
    treeJson.add("trustAnchor", context.serialize(src.getTrustAnchor(), main.java.miro.validator.types.CertificateObject.class));
    return treeJson;
}