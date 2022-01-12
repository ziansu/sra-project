private void handleAddingBundle(org.osgi.framework.Bundle bundle) {
    if ((context) == null)
        return ;
    
    java.lang.String remoteServicesHeaderValue = ((java.lang.String) (bundle.getHeaders().get(org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescriptionLocator.EndpointDescriptionBundleTrackerCustomizer.REMOTESERVICE_MANIFESTHEADER)));
    if (remoteServicesHeaderValue != null) {
        java.lang.String[] paths = remoteServicesHeaderValue.split(",");
        if (paths != null)
            for (int i = 0; i < (paths.length); i++)
                handleEndpointDescriptionPath(bundle, paths[i]);
            
        
    }
}