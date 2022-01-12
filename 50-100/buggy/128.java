private static java.lang.Integer getIntegerFromJson(com.google.gson.JsonObject jsonObj, java.lang.String propertyName) {
    java.lang.Integer result = null;
    if (!(jsonObj.get(propertyName).isJsonNull())) {
        result = jsonObj.get(propertyName).getAsInt();
    }
    return result;
}