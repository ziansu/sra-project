@java.lang.Override
public java.lang.Boolean publish(org.geosdi.geoplatform.request.PublishLayerRequest publishRequest) throws java.io.FileNotFoundException, org.geosdi.geoplatform.exception.ResourceNotFoundFault {
    logger.info(((((("\n Start to publish " + (publishRequest.getLayerName())) + " in ") + (publishRequest.getWorkspace())) + ":") + (publishRequest.getDataStoreName())));
    return this.unscheduleJob(publishRequest.getLayerName());
}