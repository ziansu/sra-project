@java.lang.Override
protected void applyNodeLabelFontFace(org.cytoscape.view.vizmap.VisualStyle visualStyle) {
    org.cytoscape.view.vizmap.mappings.DiscreteMapping fontDiscreteMapping = ((org.cytoscape.view.vizmap.mappings.DiscreteMapping) (this.discreteMappingFactoryServiceRef.createVisualMappingFunction(NodeAttribute.Department.toString(), java.lang.String.class, BasicVisualLexicon.NODE_LABEL_FONT_FACE)));
    fontDiscreteMapping.putMapValue(Location.UofT.toString(), new java.awt.Font("Verdana", java.awt.Font.BOLD, 12));
}