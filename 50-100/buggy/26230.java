private static java.lang.String getStringFromJson(com.google.gson.JsonObject jsonObj, java.lang.String propertyName) {
    java.lang.String result = null;
    if (!(jsonObj.get(propertyName).isJsonNull())) {
        result = jsonObj.get(propertyName).getAsString();
    }
    return result;
}