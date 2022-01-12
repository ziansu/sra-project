private void addInstanceSpecificationInModel(org.eclipse.uml2.uml.InstanceSpecification linkInstance, org.eclipse.uml2.uml.Model model) {
    java.lang.Package pack = eu.supersede.dynadapt.modeladapter.ModelAdapterUtilities.getPackageInModel(linkInstance.getNearestPackage(), model);
    if (pack != null) {
        org.eclipse.uml2.uml.InstanceSpecification newLinkInstance = eu.supersede.dynadapt.modeladapter.ModelAdapterUtilities.createElement(linkInstance, pack, baseJointpoints, model);
        for (org.eclipse.uml2.uml.Slot slot : linkInstance.getSlots()) {
            addSlotInInstanceSpecification(slot, newLinkInstance, model);
        }
    }
}