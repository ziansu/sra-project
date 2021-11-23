private java.lang.String getLastLayoutStatus(org.eclipse.graphiti.features.context.IUpdateContext context) {
    org.eclipse.graphiti.mm.pictograms.PictogramElement pe = context.getPictogramElement();
    java.lang.String layoutStatus = org.imixs.bpmn.ImixsBPMNPlugin.getPropertyValue(pe, "layoutstatus.property");
    if ((layoutStatus == null) || (layoutStatus.isEmpty())) {
        java.lang.System.out.println("layoutstatus.property not yet created...");
        layoutStatus = "";
    }
    return layoutStatus;
}