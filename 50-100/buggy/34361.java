@org.carlspring.logging.rest.GET
@org.carlspring.logging.rest.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
@org.carlspring.logging.rest.Path(value = "/partial-log/{path:.*}")
public javax.ws.rs.core.Response partialLogDownload(@org.carlspring.logging.rest.PathParam(value = "path")
java.lang.String path, @org.carlspring.logging.rest.QueryParam(value = "offset")
long offset) {
    try {
        java.io.InputStream is = loggingManagementService.downloadLog(path);
        is.skip(offset);
        return javax.ws.rs.core.Response.ok(is).build();
    } catch (java.io.IOException ex) {
        return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
    } catch (org.carlspring.logging.exceptions.LoggingConfigurationException ex) {
        return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
    }
}