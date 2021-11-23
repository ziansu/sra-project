@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{id}/suspend")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.SYSTEM_ADMIN , com.emc.storageos.security.authorization.Role.RESTRICTED_SYSTEM_ADMIN , com.emc.storageos.security.authorization.Role.SYSTEM_MONITOR , com.emc.storageos.security.authorization.Role.TENANT_ADMIN })
public javax.ws.rs.core.Response suspendWorkflow(@javax.ws.rs.PathParam(value = "id")
java.net.URI uri) {
    suspendWorkflowStep(uri, com.emc.storageos.db.client.util.NullColumnValueGetter.getNullURI());
    return javax.ws.rs.core.Response.ok().build();
}