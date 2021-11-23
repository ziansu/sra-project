@java.lang.Override
public java.lang.String getWelcomeFile(java.lang.String pathInContext) {
    if ((_welcomes) == null)
        return null;
    
    for (int i = 0; i < (_welcomes.length); i++) {
        java.lang.String welcome_in_context = org.eclipse.jetty.util.URIUtil.addPaths(pathInContext, _welcomes[i]);
        org.eclipse.jetty.util.resource.Resource welcome = getResource(welcome_in_context);
        if ((welcome != null) && (welcome.exists()))
            return welcome_in_context;
        
    }
    return null;
}