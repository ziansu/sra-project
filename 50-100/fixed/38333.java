@com.emc.sa.api.POST
@com.emc.sa.api.Path(value = "/{id}/deactivate")
@com.emc.sa.api.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.TENANT_ADMIN })
public javax.ws.rs.core.Response deactivateOrder(@com.emc.sa.api.PathParam(value = "id")
java.net.URI id) throws com.emc.storageos.db.exceptions.DatabaseException {
    com.emc.sa.api.Order order = queryResource(id);
    com.emc.storageos.api.service.impl.resource.ArgValidator.checkEntity(order, id, true);
    orderManager.deleteOrder(order);
    auditOpSuccess(OperationTypeEnum.DELETE_ORDER, order.auditParameters());
    return javax.ws.rs.core.Response.ok().build();
}