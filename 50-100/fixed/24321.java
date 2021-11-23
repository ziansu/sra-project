private org.neo4j.ogm.json.JSONObject getRequest(final java.lang.String command, final java.util.List<java.lang.Object> params) {
    org.neo4j.ogm.json.JSONObject request = new org.neo4j.ogm.json.JSONObject();
    try {
        request.put(com.oakinvest.b2g.service.BitcoindServiceImplementation.PARAMETER_METHOD, command);
        request.put(com.oakinvest.b2g.service.BitcoindServiceImplementation.PARAMETER_PARAMS, params);
    } catch (org.neo4j.ogm.json.JSONException e) {
        log.error(("Error while building the request " + e));
    }
    return request;
}