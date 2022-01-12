@java.lang.Override
public boolean isPermitted(com.sun.jersey.spi.container.ContainerRequest request) {
    java.lang.String uri = request.getEntity(java.lang.String.class);
    try {
        if (!(org.mycore.access.MCRAccessManager.checkPermission(org.urmel.dbt.rc.resources.MailResourcePermission.PERMISSION_MAIL))) {
            return false;
        }
        return true;
    } catch (java.lang.Exception exc) {
        throw new javax.ws.rs.WebApplicationException(exc, javax.ws.rs.core.Response.status(Status.INTERNAL_SERVER_ERROR).entity(((("Unable to check permission for request " + (request.getRequestUri())) + " containing entity value ") + uri)).build());
    }
}