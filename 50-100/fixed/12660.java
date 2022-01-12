@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/submit/{actionType}")
public javax.ws.rs.core.Response submitCmdlet(@javax.ws.rs.PathParam(value = "actionType")
java.lang.String actionType, @javax.ws.rs.FormParam(value = "args")
java.lang.String args) {
    try {
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.CREATED, smartEngine.getCmdletManager().submitCmdlet(((actionType + " ") + args))).build();
    } catch (java.lang.Exception e) {
        org.smartdata.server.rest.CmdletRestApi.logger.error("Exception in ActionRestApi while adding cmdlet", e);
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.INTERNAL_SERVER_ERROR, e.getMessage(), org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e)).build();
    }
}