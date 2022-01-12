void fireLocationChangedEvent(final android.location.Location location) {
    android.util.Log.d(com.phonegap.geofencing.DGGeofencing.TAG, "fireLocationChangedEvent");
    org.json.JSONObject returnInfo = new org.json.JSONObject();
    try {
        addLocation(location, returnInfo, "new");
        if ((oldLocation) != null)
            addLocation(oldLocation, returnInfo, "old");
        
        returnInfo.put("callbacktype", "locationupdate");
    } catch (org.json.JSONException ex) {
        errorCallback(ex.toString());
        throw new java.lang.RuntimeException("location could not be serialized to json", ex);
    }
    successCallback(returnInfo);
}