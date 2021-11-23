public void setRoute(com.openshift.restclient.model.route.IRoute newRoute, boolean executeCommand) {
    java.lang.String prevHost = getHost(getRoute());
    super.setRoute(newRoute);
    java.lang.String newHost = getHost(newRoute);
    java.lang.String newRouteURL = getRouteURL(isSelectDefaultRoute(), newRoute);
    if (executeCommand)
        section.execute(new org.jboss.tools.openshift.internal.ui.server.OpenShiftServerEditorModel.SetRouteCommand(getServer(), getRoute(), newRoute, newRouteURL, prevHost, newHost));
    
}