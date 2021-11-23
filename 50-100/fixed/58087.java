private static void decorateEdge(main.graphs.interfaces.IEdge edge, main.graphs.interfaces.IVertex source, main.graphs.interfaces.IVertex target, java.util.Collection<main.graphs.DecorationSpecification> decorationSpecifications) {
    for (main.graphs.DecorationSpecification decorationSpecification : decorationSpecifications) {
        if ((decorationSpecification.getSource().equals(source)) && (decorationSpecification.getTarget().equals(target))) {
            edge.getDecorations().add(decorationSpecification.getDecoration());
        }
    }
}