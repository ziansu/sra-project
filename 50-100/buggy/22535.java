public java.lang.String getMetadataStringFromFormularString(java.lang.String formularString) {
    com.google.gson.JsonElement formularElement = new com.google.gson.JsonParser().parse(formularString);
    com.google.gson.JsonObject metadataObject = formularElement.getAsJsonObject();
    metadataObject = metadataObject.getAsJsonObject("metadata");
    java.lang.String metadataString = metadataObject.toString();
    return metadataString;
}