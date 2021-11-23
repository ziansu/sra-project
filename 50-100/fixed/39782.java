private java.util.Optional<? extends org.mm.rendering.text.TextRendering> renderOWLMaxCardinality(org.mm.parser.node.OWLPropertyNode propertyNode, org.mm.parser.node.OWLMaxCardinalityNode maxCardinalityNode) throws org.mm.renderer.RendererException {
    java.lang.String textRepresentation = "" + (maxCardinalityNode.getCardinality());
    if (!(textRepresentation.isEmpty()))
        textRepresentation = "MAX " + textRepresentation;
    
    return textRepresentation.isEmpty() ? java.util.Optional.empty() : java.util.Optional.of(new org.mm.rendering.text.TextRendering(textRepresentation));
}