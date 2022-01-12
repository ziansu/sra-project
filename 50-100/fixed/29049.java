public org.json.JSONObject createJSONTracking(com.google.android.gms.maps.model.LatLng init, com.google.android.gms.maps.model.LatLng goal) {
    org.json.JSONObject obj = new org.json.JSONObject();
    try {
        obj.put("pointA", init.latitude);
        obj.accumulate("pointA", init.longitude);
        obj.put("pointB", goal.latitude);
        obj.accumulate("pointB", goal.longitude);
        obj.put("angle", angleRotation);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return obj;
}