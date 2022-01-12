@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/submit")
public javax.ws.rs.core.Response submitCmdlet(java.lang.String args) {
    try {
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.CREATED, smartEngine.getCmdletManager().submitCmdlet(args)).build();
    } catch (java.lang.Exception e) {
        org.smartdata.server.rest.CmdletRestApi.logger.error("Exception in ActionRestApi while adding cmdlet", e);
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.INTERNAL_SERVER_ERROR, e.getMessage(), org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e)).build();
    }
}