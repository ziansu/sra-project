protected org.eclipse.emf.ecore.resource.Resource getTargetNotationResource(org.eclipse.emf.ecore.EObject targetOwner) {
    if (((targetOwner.eResource()) != null) && ((targetOwner.eResource().getResourceSet()) instanceof org.eclipse.papyrus.infra.core.resource.ModelSet)) {
        org.eclipse.papyrus.infra.core.resource.ModelSet modelSet = ((org.eclipse.papyrus.infra.core.resource.ModelSet) (targetOwner.eResource().getResourceSet()));
        return modelSet.getAssociatedResource(targetOwner, NotationModel.NOTATION_FILE_EXTENSION);
    }
    return null;
}