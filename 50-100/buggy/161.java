@java.lang.Override
protected void applyNodeBorderWidth(org.cytoscape.view.vizmap.VisualStyle visualStyle) {
    super.applyNodeBorderWidth(visualStyle);
    org.cytoscape.view.vizmap.mappings.DiscreteMapping borderWidthDiscreteMapping = ((org.cytoscape.view.vizmap.mappings.DiscreteMapping) (this.discreteMappingFactoryServiceRef.createVisualMappingFunction(NodeAttribute.Department.toString(), java.lang.String.class, BasicVisualLexicon.NODE_BORDER_WIDTH)));
    borderWidthDiscreteMapping.putMapValue(this.socialNetwork.getAttrMap().get(NodeAttribute.Department.toString()), 10.0);
}