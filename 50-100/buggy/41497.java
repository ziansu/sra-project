public void discardDerivedState(final org.eclipse.emf.ecore.resource.Resource resource) {
    org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> resourcesContentsList = resource.getContents();
    for (int i = 1; i < (resourcesContentsList.size()); i++) {
        {
            org.eclipse.emf.ecore.EObject eObject = resourcesContentsList.get(i);
            this.unloader.unloadRoot(eObject);
        }
    }
    org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> _contents = resource.getContents();
    _contents.clear();
}