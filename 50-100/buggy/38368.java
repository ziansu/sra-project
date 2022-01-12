@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{id}/description/tosca")
@javax.ws.rs.Consumes(value = "application/xml")
public javax.ws.rs.core.Response setApplicationDescriptionTOSCA(@javax.ws.rs.PathParam(value = "id")
java.lang.String cloudServiceId, java.lang.String celar) {
    try {
        AnalysisLogger.logger.info(("The received description " + celar));
        celar = celar.replaceAll("&amp;", "&");
        controlCoordination.setApplicationDescriptionInfoTOSCA(celar, cloudServiceId);
        return javax.ws.rs.core.Response.ok().build();
    } catch (java.lang.Exception e) {
        return javax.ws.rs.core.Response.serverError().entity(e).build();
    }
}