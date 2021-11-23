@java.lang.Override
protected void applyNodeBorderPaint(org.cytoscape.view.vizmap.VisualStyle visualStyle) {
    super.applyNodeBorderPaint(visualStyle);
    org.cytoscape.view.vizmap.mappings.DiscreteMapping borderPaintDiscreteMapping = ((org.cytoscape.view.vizmap.mappings.DiscreteMapping) (this.discreteMappingFactoryServiceRef.createVisualMappingFunction(NodeAttribute.Department.toString(), java.lang.String.class, BasicVisualLexicon.NODE_BORDER_PAINT)));
    borderPaintDiscreteMapping.putMapValue(this.socialNetwork.getAttrMap().get(NodeAttribute.Department.toString()), new java.awt.Color(243, 243, 21));
}