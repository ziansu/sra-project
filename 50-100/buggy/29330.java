private void handleSlowResponse(org.iotivity.base.OcResourceRequest request) {
    sleep(10);
    msg("Sending slow response...");
    org.iotivity.base.OcResourceResponse response = new org.iotivity.base.OcResourceResponse();
    response.setRequestHandle(request.getRequestHandle());
    response.setResourceHandle(request.getResourceHandle());
    response.setErrorCode(org.iotivity.service.pm.Light.SUCCESS);
    response.setResponseResult(EntityHandlerResult.OK);
    response.setResourceRepresentation(getOcRepresentation());
    sendResponse(response);
}