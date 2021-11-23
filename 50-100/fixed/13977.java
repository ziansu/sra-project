public org.eclipse.emf.ecore.EObject get(org.eclipse.emf.emfstore.internal.common.model.ModelElementId modelElementId) {
    final org.eclipse.emf.ecore.EObject eObject = delegateMapping.get(modelElementId);
    if (eObject != null) {
        return eObject;
    }
    if (modelElementId == null) {
        return null;
    }
    return idToEObjectMapping.get(modelElementId.getId());
}