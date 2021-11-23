private org.eclipse.uml2.uml.Element addElementToModel(org.eclipse.uml2.uml.Model model, org.eclipse.uml2.uml.PackageableElement elementToAdd) {
    java.lang.Package pack = eu.supersede.dynadapt.modeladapter.ModelAdapterUtilities.getPackageInModelMatchingElement(model, elementToAdd);
    org.eclipse.uml2.uml.PackageableElement addedElement = eu.supersede.dynadapt.modeladapter.ModelAdapterUtilities.createElement(elementToAdd, pack, baseJointpoints, model);
    addGeneralizations(addedElement, elementToAdd);
    return addedElement;
}