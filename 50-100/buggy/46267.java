@java.lang.Override
public org.apache.james.protocols.api.handler.ProtocolHandler load(java.lang.String name, org.apache.commons.configuration.Configuration config) throws org.apache.james.protocols.lib.mock.LoadingException {
    try {
        org.apache.james.protocols.api.handler.ProtocolHandler obj = create(name);
        injectResources(obj);
        postConstruct(obj, config);
        synchronized(this) {
            loaderRegistry.add(obj);
        }
        return obj;
    } catch (java.lang.Exception e) {
        throw new org.apache.james.protocols.lib.mock.LoadingException("Unable to load protocolhandler", e);
    }
}