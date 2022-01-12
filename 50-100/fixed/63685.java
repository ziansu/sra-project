@org.carlspring.logging.rest.PUT
@org.carlspring.logging.rest.Path(value = "/logger")
public javax.ws.rs.core.Response addLogger(@org.carlspring.logging.rest.QueryParam(value = "logger")
java.lang.String loggerPackage, @org.carlspring.logging.rest.QueryParam(value = "level")
java.lang.String level, @org.carlspring.logging.rest.QueryParam(value = "appenderName")
java.lang.String appenderName) {
    try {
        loggingManagementService.addLogger(loggerPackage, level, appenderName);
    } catch (org.carlspring.logging.exceptions.LoggingConfigurationException | org.carlspring.logging.exceptions.AppenderNotFoundException ex) {
        return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
    }
    return javax.ws.rs.core.Response.ok().build();
}