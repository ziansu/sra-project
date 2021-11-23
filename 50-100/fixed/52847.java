private void eContainmentAdd(org.eclipse.emf.ecore.EObject eContainer, org.eclipse.emf.ecore.EReference eContainmentReference, org.eclipse.emf.ecore.EObject eObject) {
    java.lang.Object value = eContainer.eGet(eContainmentReference);
    if (value instanceof org.eclipse.emf.common.util.EList<?>) {
        @java.lang.SuppressWarnings(value = "unchecked")
        org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> objects = ((org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject>) (value));
        objects.add(eObject);
    }
}