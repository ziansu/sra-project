@com.emc.sa.api.GET
@com.emc.sa.api.Path(value = "/job-status")
@com.emc.sa.api.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.TENANT_ADMIN })
public com.emc.sa.api.OrderJobInfo getJobStatus(@com.emc.sa.api.DefaultValue(value = "DELETE_ORDER")
@com.emc.sa.api.QueryParam(value = com.emc.vipr.client.catalog.impl.SearchConstants.JOB_TYPE)
java.lang.String typeStr) {
    com.emc.sa.api.OrderService.log.info("lbyc0:type={}", typeStr);
    com.emc.sa.api.utils.OrderServiceJob.JobType type;
    try {
        type = OrderServiceJob.JobType.valueOf(typeStr);
    } catch (java.lang.Exception e) {
        com.emc.sa.api.OrderService.log.error("Failed to get job type e=", e);
        throw APIException.badRequests.invalidParameterWithCause(SearchConstants.JOB_TYPE, typeStr, e);
    }
    com.emc.sa.api.utils.OrderJobStatus status = queryJobInfo(type);
    return status != null ? status.toOrderJobInfo() : new com.emc.sa.api.OrderJobInfo();
}