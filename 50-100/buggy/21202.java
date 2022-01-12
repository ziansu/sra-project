@java.lang.Override
public br.uff.labtempo.omcp.common.Response process(br.uff.labtempo.omcp.common.Request request) throws br.uff.labtempo.omcp.common.exceptions.BadRequestException, br.uff.labtempo.omcp.common.exceptions.InternalServerErrorException, br.uff.labtempo.omcp.common.exceptions.MethodNotAllowedException, br.uff.labtempo.omcp.common.exceptions.NotFoundException, br.uff.labtempo.omcp.common.exceptions.NotImplementedException {
    br.uff.labtempo.omcp.common.Response response = null;
    try {
        return routing(request);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Error in process: " + (e.getMessage())));
    } finally {
        return new br.uff.labtempo.omcp.common.Response(br.uff.labtempo.osiris.function.sum.configuration.AppConfig.PROTOCOL_VERSION, br.uff.labtempo.omcp.common.StatusCode.INTERNAL_SERVER_ERROR, java.util.Calendar.getInstance(), br.uff.labtempo.osiris.function.sum.configuration.AppConfig.MODULE_NAME, null, 0, RESPONSE_ERROR_MEDIATYPE, null, "Failed to process request");
    }
}