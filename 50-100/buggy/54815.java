private static org.json.JSONObject createJsonLocation(android.content.Context context) throws org.json.JSONException {
    android.location.Location location = com.swiftsoft.colossus.mobileoil.Utils.getCurrentLocation(context);
    org.json.JSONObject json = new org.json.JSONObject();
    json.put("Latitude", location.getLatitude());
    json.put("Longitude", location.getLongitude());
    json.put("Accuracy", location.getAccuracy());
    return json;
}