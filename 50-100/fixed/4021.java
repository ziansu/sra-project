@java.lang.Override
public java.lang.Boolean call(com.google.gson.JsonObject jsonObject) {
    com.google.gson.JsonElement jsonElement = jsonObject.get(com.sfparks.model.ParksModule.LOCATION_1).getAsJsonObject().get(com.sfparks.model.ParksModule.LATITUDE);
    return !((jsonElement == null) || (jsonElement.getAsString().equals("999")));
}