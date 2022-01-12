private org.eclipse.emf.ecore.EObject getEObject() {
    if ((fDiff) != null) {
        return fDiff.getView();
    }
    return null;
}