private org.iotivity.base.EntityHandlerResult handlePutRequest(org.iotivity.base.OcResourceRequest request) {
    org.iotivity.base.OcResourceResponse response = new org.iotivity.base.OcResourceResponse();
    response.setRequestHandle(request.getRequestHandle());
    response.setResourceHandle(request.getResourceHandle());
    setOcRepresentation(request.getResourceRepresentation());
    response.setResourceRepresentation(getOcRepresentation());
    response.setResponseResult(EntityHandlerResult.OK);
    response.setErrorCode(org.iotivity.service.pm.Light.SUCCESS);
    return sendResponse(response);
}