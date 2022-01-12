public void broadcast(java.util.List<java.io.Serializable> messages, org.atmosphere.gwt.server.GwtAtmosphereResource resource) {
    if (messages == null) {
        return ;
    }
    resource.getBroadcaster().broadcast(messages);
}