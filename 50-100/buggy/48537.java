public static java.util.List<org.osate.xtext.aadl2.errormodel.errorModel.EMV2PropertyAssociation> getProperty(java.lang.String propertyName, org.osate.aadl2.NamedElement ci, org.osate.aadl2.NamedElement target, org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes ts) {
    java.util.List<org.osate.xtext.aadl2.errormodel.errorModel.EMV2PropertyAssociation> result = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getPropertyInInstanceHierarchy(propertyName, ci, target, ts);
    if (result == null) {
        java.util.List<org.osate.xtext.aadl2.errormodel.errorModel.EMV2PropertyAssociation> props = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getPropertyAssociationListInContext(target);
        if (props != null) {
            result = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getMatchingPropertiesInList(props, propertyName, target, ts);
        }
    }
    return result;
}