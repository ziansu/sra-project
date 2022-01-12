@com.rafikzebdi.epargnator.rest.GET
@com.rafikzebdi.epargnator.rest.Path(value = "/{reference}")
@com.rafikzebdi.epargnator.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getSpecificPersonne(@com.rafikzebdi.epargnator.rest.PathParam(value = "reference")
final int referenceToFind) {
    javax.ws.rs.core.Response.ResponseBuilder builder = null;
    try {
        final java.util.List<com.rafikzebdi.epargnator.domain.personne.Personne> personnesSpecificFound = personneService.getSpecificPersonne(referenceToFind);
        builder = javax.ws.rs.core.Response.ok(personnesSpecificFound);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        builder = javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST);
    }
    return builder.build();
}