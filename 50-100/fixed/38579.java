public com.google.android.gms.maps.model.LatLng getCoordinates(org.json.JSONObject jsonObject) {
    try {
        org.json.JSONObject childObject = jsonObject.getJSONObject(JsonAttribute.SHAPE.getAttribute());
        org.json.JSONArray coordinates = childObject.getJSONArray(JsonAttribute.COORDINATES.getAttribute());
        return new com.google.android.gms.maps.model.LatLng(coordinates.getDouble(1), coordinates.getDouble(0));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}