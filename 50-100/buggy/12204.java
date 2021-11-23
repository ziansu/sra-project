protected java.lang.Integer doInBackground(java.lang.String... params) {
    java.lang.Integer responseCode = 0;
    try {
        javax.ws.rs.core.MultivaluedMap map = new com.sun.jersey.core.util.MultivaluedMapImpl();
        map.add("username", params[0]);
        map.add("latitude", params[1]);
        map.add("longitude", params[2]);
        crm.geoalertapp.crm.geoalertapp.utilities.RestClient tc = new crm.geoalertapp.crm.geoalertapp.utilities.RestClient(map);
        responseCode = tc.postForResponseCode("location/update");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return responseCode;
}