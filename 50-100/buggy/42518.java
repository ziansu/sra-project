@javax.ws.rs.Path(value = "/{service_name}/delete")
@javax.ws.rs.DELETE
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteWebService(@javax.ws.rs.PathParam(value = "service_name")
java.lang.String serviceName) throws org.json.JSONException {
    java.lang.System.out.println("mi sto connettendo all'ontologia");
    eu.scase.qosontology.OntologyQoSAPI ontology = new eu.scase.qosontology.OntologyQoSAPI();
    java.lang.System.out.println(("DELETE service_name:" + serviceName));
    ontology.deleteWebService(serviceName);
    ontology.close();
    org.json.JSONObject json = new org.json.JSONObject();
    json.put("service_name", serviceName);
    return javax.ws.rs.core.Response.status(200).entity(json.toString()).build();
}