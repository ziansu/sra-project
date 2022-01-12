public int showMaximumIndependentSet() {
    java.util.Set<no.uib.ii.algo.st8.start.UnVertex> cover = no.uib.ii.algo.st8.algorithms.ExactVertexCover.findExactVertexCover(graph.getGraph());
    clearAll();
    markedVertices.addAll(graph.getVertices());
    markedVertices.removeAll(cover);
    return markedVertices.size();
}