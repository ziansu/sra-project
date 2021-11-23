@java.lang.Override
public boolean isPermitted(com.sun.jersey.spi.container.ContainerRequest request) {
    java.lang.String uri = request.getEntity(java.lang.String.class);
    try {
        return org.mycore.access.MCRAccessManager.checkPermission(org.urmel.dbt.rc.resources.MailResourcePermission.PERMISSION_MAIL);
    } catch (java.lang.Exception exc) {
        throw new javax.ws.rs.WebApplicationException(exc, javax.ws.rs.core.Response.status(Status.INTERNAL_SERVER_ERROR).entity(((("Unable to check permission for request " + (request.getRequestUri())) + " containing entity value ") + uri)).build());
    }
}