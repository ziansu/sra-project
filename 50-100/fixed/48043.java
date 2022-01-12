public static void changePosition(android.location.Location position) {
    org.json.JSONObject object = new org.json.JSONObject();
    com.google.android.gms.maps.model.LatLng pos = new com.google.android.gms.maps.model.LatLng(position.getLatitude(), position.getLongitude());
    try {
        object.put("id", cth.codetroopers.urbanwarfare.ClientSide.ClientController.playerID);
        object.put("lat", pos.latitude);
        object.put("lang", pos.longitude);
        cth.codetroopers.urbanwarfare.ClientSide.ClientController.socket.emit("position-changed", object);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}