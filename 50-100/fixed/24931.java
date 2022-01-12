public static java.util.List<org.osate.xtext.aadl2.errormodel.errorModel.EMV2PropertyAssociation> getHazardsProperty(org.osate.aadl2.NamedElement ci, org.osate.aadl2.NamedElement target, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet ts) {
    java.util.List<org.osate.xtext.aadl2.errormodel.errorModel.EMV2PropertyAssociation> result = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getProperty("EMV2::hazards", ci, target, ts);
    if (result.isEmpty()) {
        result = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getProperty("ARP4761::hazards", ci, target, ts);
    }
    if (result.isEmpty()) {
        result = org.osate.xtext.aadl2.errormodel.util.EMV2Properties.getProperty("MILSTD882::hazards", ci, target, ts);
    }
    return result;
}