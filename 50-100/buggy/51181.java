@java.lang.Override
public void applyAddComposition(org.eclipse.uml2.uml.Model inBaseModel, org.eclipse.uml2.uml.Element jointpointBaseModelElement, org.eclipse.uml2.uml.Model usingVariantModel, org.eclipse.uml2.uml.Element jointpointVariantModelElement) {
    org.eclipse.uml2.uml.internal.impl.ClassImpl classBase = ((org.eclipse.uml2.uml.internal.impl.ClassImpl) (jointpointBaseModelElement));
    org.eclipse.uml2.uml.internal.impl.ClassImpl classVariant = ((org.eclipse.uml2.uml.internal.impl.ClassImpl) (jointpointVariantModelElement));
    addProperties(classVariant, classBase);
    addOperations(classVariant, classBase);
    addGeneralizations(classVariant, classBase);
}