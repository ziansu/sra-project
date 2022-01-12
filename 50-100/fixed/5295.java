public static org.osate.aadl2.ComponentClassifier getAssociatedClassifier(org.osate.aadl2.Element emv2Element) {
    org.osate.aadl2.ComponentClassifier cl = ((org.osate.aadl2.ComponentClassifier) (emv2Element.getContainingClassifier()));
    if (cl != null)
        return cl;
    
    org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause emsc = org.osate.xtext.aadl2.errormodel.util.EMV2Util.getContainingErrorModelSubclause(emv2Element);
    if ((emsc == null) || ((emsc.getName()) == null))
        return null;
    
    return ((org.osate.aadl2.ComponentClassifier) (org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval.getEObjectOfType(emsc, Aadl2Package.eINSTANCE.getComponentClassifier(), emsc.getQualifiedName())));
}