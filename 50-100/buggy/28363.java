public org.wso2.msf4j.internal.router.PatternPathRouter.RoutableDestination<java.lang.Object> getRoutableEndpoint(org.wso2.carbon.messaging.CarbonMessage carbonMessage) throws org.wso2.msf4j.websocket.exception.WebSocketEndpointAnnotationException {
    java.lang.String uri = ((java.lang.String) (carbonMessage.getProperty(Constants.TO)));
    org.wso2.msf4j.internal.websocket.EndpointsRegistryImpl.LOGGER.info(("path : " + uri));
    java.util.List<org.wso2.msf4j.internal.router.PatternPathRouter.RoutableDestination<java.lang.Object>> routableDestinations = endpointPatternPathRouter.getDestinations(uri);
    return getBestEndpoint(routableDestinations, uri);
}