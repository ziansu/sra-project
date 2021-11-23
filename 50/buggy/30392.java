public void addCustomArray(java.lang.String name) {
    schema.getAsJsonObject().add(name, new com.google.gson.JsonArray());
}