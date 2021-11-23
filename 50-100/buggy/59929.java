@org.smartdata.server.rest.POST
@org.smartdata.server.rest.Path(value = "/submit")
public javax.ws.rs.core.Response submitCmdlet(@org.smartdata.server.rest.FormParam(value = "actionType")
java.lang.String actionType, @org.smartdata.server.rest.FormParam(value = "args")
java.lang.String args) {
    java.lang.String arg = (actionType + ' ') + args;
    try {
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.CREATED, smartEngine.getCmdletManager().submitCmdlet(arg)).build();
    } catch (java.lang.Exception e) {
        org.smartdata.server.rest.CmdletRestApi.logger.error("Exception in ActionRestApi while adding cmdlet", e);
        return new org.smartdata.server.rest.message.JsonResponse(Response.Status.INTERNAL_SERVER_ERROR, e.getMessage(), org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e)).build();
    }
}