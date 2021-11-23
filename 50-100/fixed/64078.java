@java.lang.Override
public void createGeoEntitySynonym(java.lang.String entityId, java.lang.String label) throws java.io.IOException, javax.servlet.ServletException {
    com.runwaysdk.constants.ClientRequestIF request = this.getClientRequest();
    try {
        java.lang.String response = net.geoprism.DataUploaderDTO.createGeoEntitySynonym(request, entityId, label);
        org.json.JSONObject object = new org.json.JSONObject(response);
        net.geoprism.JSONControllerUtil.writeReponse(this.resp, object);
    } catch (java.lang.Throwable t) {
        net.geoprism.JSONControllerUtil.handleException(this.resp, t, request);
    }
}