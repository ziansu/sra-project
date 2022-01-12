@biocode.fims.rest.services.rest.GET
@biocode.fims.rest.services.rest.Path(value = "/{projectId}/abstract")
@biocode.fims.rest.services.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getAbstract(@biocode.fims.rest.services.rest.PathParam(value = "projectId")
int projectId) {
    org.json.simple.JSONObject obj = new org.json.simple.JSONObject();
    biocode.fims.run.TemplateProcessor t = new biocode.fims.run.TemplateProcessor(projectId, uploadPath(), true);
    obj.put("abstract", t.printAbstract());
    return javax.ws.rs.core.Response.ok(obj.toJSONString()).build();
}