private void eContainmentAdd(org.eclipse.emf.ecore.EObject eContainer, org.eclipse.emf.ecore.EReference eContainmentReference, org.eclipse.emf.ecore.EObject eObject) {
    java.lang.Object value = eContainer.eGet(eContainmentReference);
    if (value instanceof org.eclipse.emf.common.util.EList<?>) {
        org.eclipse.emf.common.util.EList<?> objects = ((org.eclipse.emf.common.util.EList<?>) (value));
        java.util.List<java.lang.Object> newObjects = new java.util.ArrayList(objects);
        newObjects.add(eObject);
        eContainer.eSet(eContainmentReference, newObjects);
    }
}