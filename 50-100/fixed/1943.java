@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.TEXT_HTML })
public javax.ws.rs.core.Response createFormResponse(dash.pojo.FormResponse formResponse) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.databind.JsonMappingException, dash.errorhandling.AppException, java.io.IOException {
    java.lang.Long createFormResponseId = formResponseService.createFormResponse(formResponse);
    return javax.ws.rs.core.Response.status(Response.Status.CREATED).entity(createFormResponseId.toString()).header("Location", java.lang.String.valueOf(createFormResponseId)).header("ObjectId", java.lang.String.valueOf(createFormResponseId)).build();
}