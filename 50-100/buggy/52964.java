@java.lang.Override
public void onSuccess(java.lang.String jsonResponse) {
    if (!(jsonResponse.equalsIgnoreCase("null"))) {
        java.lang.Integer sid = java.lang.Integer.valueOf(jsonResponse);
        de.bund.bfr.crisis.client.Station s = stations.get(sid);
        org.gwtopenmaps.openlayers.client.Map map = getMap();
        map.setCenter(new org.gwtopenmaps.openlayers.client.LonLat(s.getLongitude(), s.getLatitude()), 6);
        logger.log(java.util.logging.Level.SEVERE, ("Received result " + sid));
    }
}