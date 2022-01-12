private org.upb.fmde.de.categories.concrete.graphs.GraphMorphism createRuleAppendCard() {
    org.upb.fmde.de.categories.concrete.graphs.Graph left = createHostGraph();
    org.upb.fmde.de.categories.concrete.graphs.Graph right = createAppendCardGraph();
    org.upb.fmde.de.categories.concrete.finsets.TotalFunction edgeArrow = new org.upb.fmde.de.categories.concrete.finsets.TotalFunction(left.edges(), "edge arrow", right.edges());
    org.upb.fmde.de.categories.concrete.finsets.TotalFunction verticeFunction = new org.upb.fmde.de.categories.concrete.finsets.TotalFunction(left.vertices(), "vertice arrow", right.vertices());
    verticeFunction.addMapping(new java.lang.String("B"), new java.lang.String("B"));
    org.upb.fmde.de.categories.concrete.graphs.GraphMorphism morph = new org.upb.fmde.de.categories.concrete.graphs.GraphMorphism("append Card", left, right, edgeArrow, verticeFunction);
    return morph;
}