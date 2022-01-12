@java.lang.Override
public java.lang.Boolean call(com.google.gson.JsonObject jsonObject) {
    android.util.Log.d("sfparks parksModule", "about to filter 2");
    com.google.gson.JsonElement jsonElement = jsonParser.parse(jsonObject.get(com.sfparks.model.ParksModule.LOCATION_1).getAsString()).getAsJsonObject().get(com.sfparks.model.ParksModule.LATITUDE);
    return !((jsonElement == null) || (jsonElement.getAsString().equals("999")));
}