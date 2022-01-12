@java.lang.Override
public esa.mo.mal.transport.gen.MALEndpoint createEndpoint(final java.lang.String localName, final java.util.Map qosProperties) throws esa.mo.mal.transport.gen.MALException {
    final java.lang.String strRoutingName = getLocalName(localName);
    esa.mo.mal.transport.gen.GENEndpoint endpoint = endpointRoutingMap.get(strRoutingName);
    if (null == endpoint) {
        esa.mo.mal.transport.gen.GENTransport.LOGGER.log(java.util.logging.Level.INFO, "GEN Creating endpoint {0} : {1}", new java.lang.Object[]{ localName , strRoutingName });
        endpoint = internalCreateEndpoint(localName, strRoutingName, qosProperties);
        endpointMalMap.put(localName, endpoint);
        endpointRoutingMap.put(strRoutingName, endpoint);
    }
    return endpoint;
}