public static org.json.simple.JSONObject toJSON(android.location.Location location) {
    if (location == null)
        return null;
    
    org.json.simple.JSONObject loc = new org.json.simple.JSONObject();
    loc.put("provider", location.getProvider());
    loc.put("lat", location.getLatitude());
    loc.put("lng", location.getLongitude());
    loc.put("accuracy", location.getAccuracy());
    loc.put("timestamp", location.getTime());
    return loc;
}