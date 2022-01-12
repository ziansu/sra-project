@java.lang.Override
public void run() {
    switch (type) {
        case org.osgi.service.remoteserviceadmin.EndpointEvent.ADDED :
            addEndpoint(ed);
            break;
        case org.osgi.service.remoteserviceadmin.EndpointEvent.REMOVED :
            removeEndpoint(ed);
            break;
    }
    viewer.setExpandedState(contentProvider.getRootNode(), true);
    viewer.refresh();
}