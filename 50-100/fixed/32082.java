private java.util.Optional<? extends org.mm.rendering.text.TextRendering> renderOWLExactCardinality(org.mm.parser.node.OWLPropertyNode propertyNode, org.mm.parser.node.OWLExactCardinalityNode owlExactCardinalityNode) throws org.mm.renderer.RendererException {
    java.lang.String textRepresentation = "" + (owlExactCardinalityNode.getCardinality());
    if (!(textRepresentation.isEmpty()))
        textRepresentation = "EXACTLY " + textRepresentation;
    
    return textRepresentation.isEmpty() ? java.util.Optional.empty() : java.util.Optional.of(new org.mm.rendering.text.TextRendering(textRepresentation));
}