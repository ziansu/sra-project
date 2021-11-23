public boolean apply(final org.eclipse.xtext.resource.IResourceDescription input) {
    if (matchReferences) {
        for (org.eclipse.xtext.resource.IReferenceDescription ref : input.getReferenceDescriptions()) {
            if (targetUris.contains(ref.getTargetEObjectUri().trimFragment())) {
                return true;
            }
        }
    }
    if (matchNames) {
        for (org.eclipse.xtext.naming.QualifiedName name : input.getImportedNames()) {
            if (exportedNames.contains((ignoreCase ? name.toLowerCase() : name))) {
                return true;
            }
        }
    }
    return false;
}