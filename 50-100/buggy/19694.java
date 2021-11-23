@java.lang.Override
public void run() {
    org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescription ed = ((org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescription) (event.getEndpoint()));
    int type = event.getType();
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