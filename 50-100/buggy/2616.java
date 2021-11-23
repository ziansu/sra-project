@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "{id}/is-answered")
public org.codehaus.jettison.json.JSONObject isAnswered(@javax.ws.rs.PathParam(value = "id")
java.lang.Integer id) throws java.rmi.RemoteException, org.codehaus.jettison.json.JSONException {
    org.codehaus.jettison.json.JSONObject serverResponse = new org.codehaus.jettison.json.JSONObject();
    try {
        serverResponse.put("isAnsewred", solicitudBL.isAnswered(id));
    } catch (co.edu.udea.iw.exception.ExceptionHandler e) {
        throw new java.rmi.RemoteException("No se pudo consultar estado, intente más tarde");
    }
    return serverResponse;
}