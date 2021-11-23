private boolean isParent(org.eclipse.xtext.resource.IEObjectDescription desc, org.eclipse.emf.ecore.EObject o) {
    org.eclipse.emf.common.util.URI descUri = desc.getEObjectURI();
    org.eclipse.emf.common.util.URI oUri = o.eResource().getURI();
    if (!(descUri.path().equals(oUri.path())))
        return false;
    
    boolean result = o.eResource().getURIFragment(o).startsWith(descUri.fragment());
    return result;
}