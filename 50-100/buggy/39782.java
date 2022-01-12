private java.util.Optional<? extends org.mm.rendering.text.TextRendering> renderOWLMaxCardinality(org.mm.parser.node.OWLPropertyNode propertyNode, org.mm.parser.node.OWLMaxCardinalityNode maxCardinalityNode) throws org.mm.renderer.RendererException {
    java.lang.String textRepresentation = "" + (maxCardinalityNode.getCardinality());
    if (!(textRepresentation.isEmpty()))
        return java.util.Optional.of(new org.mm.rendering.text.TextRendering(("MAX " + textRepresentation)));
    else
        return java.util.Optional.empty();
    
}