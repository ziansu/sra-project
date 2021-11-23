@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id: \\d+}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response obtainProgress(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) {
    com.mycompany.nncloudrestservice.logic.TrainingProgressManager progressManager = new com.mycompany.nncloudrestservice.logic.TrainingProgressManager();
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(progressManager.getProgress(id).toString()).build();
}