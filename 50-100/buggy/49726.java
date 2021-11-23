@com.rafikzebdi.epargnator.rest.DELETE
@com.rafikzebdi.epargnator.rest.Path(value = "/{reference}")
@com.rafikzebdi.epargnator.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deletePersonne(@com.rafikzebdi.epargnator.rest.PathParam(value = "reference")
final java.lang.String referenceToDelete) {
    javax.ws.rs.core.Response.ResponseBuilder builder = null;
    try {
        personneService.deletePersonne(referenceToDelete);
        builder = javax.ws.rs.core.Response.ok(referenceToDelete);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        builder = javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST);
    }
    return builder.build();
}