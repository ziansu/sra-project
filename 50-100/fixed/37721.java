@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.TENANT_ADMIN })
@javax.ws.rs.Path(value = "/{id}/hosts")
@java.lang.Deprecated
public com.emc.storageos.model.TaskResourceRep createHost(@javax.ws.rs.PathParam(value = "id")
java.net.URI tid, com.emc.storageos.model.host.HostCreateParam createParam, @javax.ws.rs.QueryParam(value = "validate_connection")
@javax.ws.rs.DefaultValue(value = "false")
final java.lang.Boolean validateConnection) {
    com.emc.storageos.db.client.model.TenantOrg tenant = getTenantById(tid, true);
    com.emc.storageos.api.service.impl.resource.HostService hostService = _hostService;
    hostService.validateHostData(createParam, tid, null, validateConnection);
    return hostService.createNewHost(tenant, createParam);
}