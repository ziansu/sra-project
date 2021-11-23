@java.lang.Override
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "activity/{id}")
public javax.ws.rs.core.Response getActivity(@javax.ws.rs.PathParam(value = "type")
java.lang.String type, @javax.ws.rs.PathParam(value = "id")
java.lang.String id) throws org.wso2.carbon.device.mgt.jaxrs.api.common.MDMAPIException {
    org.wso2.carbon.device.mgt.jaxrs.api.impl.Operation operation;
    org.wso2.carbon.device.mgt.core.service.DeviceManagementProviderService dmService;
    try {
        dmService = org.wso2.carbon.device.mgt.jaxrs.api.util.DeviceMgtAPIUtils.getDeviceManagementService();
        operation = dmService.getOperationByActivityId(type, id);
    } catch (org.wso2.carbon.device.mgt.common.operation.mgt.OperationManagementException e) {
        java.lang.String msg = "Error occurred while fetching the activity for the supplied id.";
        org.wso2.carbon.device.mgt.jaxrs.api.impl.OperationImpl.log.error(msg, e);
        throw new org.wso2.carbon.device.mgt.jaxrs.api.common.MDMAPIException(msg, e);
    }
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(operation).build();
}