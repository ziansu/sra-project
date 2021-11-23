protected void writeLastGeolocationResponse(final java.lang.String lastGeolocationResponse, final com.google.gson.JsonObject object) {
    if (lastGeolocationResponse != null) {
        object.addProperty("last_geolocation_response", lastGeolocationResponse);
    }else {
        object.add("last_geolocation_response", com.google.gson.JsonNull.INSTANCE);
    }
}