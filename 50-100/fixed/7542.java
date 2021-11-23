@java.lang.Override
public boolean exists() {
    boolean exists = super.exists();
    if (!exists) {
        org.eclipse.emf.ecore.EObject input = getInput(false);
        if (input != null) {
            org.eclipse.emf.ecore.resource.Resource resource = input.eResource();
            if ((resource != null) && ((resource.getResourceSet()) != null)) {
                exists = resource.getResourceSet().getURIConverter().exists(resource.getURI(), null);
            }
        }
    }
    return exists;
}