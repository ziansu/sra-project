public void removeTransportRequestHandler(final org.elasticsearch.transport.TransportRequestHandler transportRequestHandler, final java.util.Map<java.lang.String, java.lang.String> map) {
    final java.lang.String actionPropertyValue = map.get(com.enonic.xp.elasticsearch.impl.ElasticsearchActivator.ACTION_PROPERTY_KEY);
    if ((this.transportService) != null) {
        this.transportService.removeHandler(actionPropertyValue);
    }
}