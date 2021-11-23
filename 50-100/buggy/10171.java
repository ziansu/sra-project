public void showMaximumIndependentSet() {
    java.util.Set<no.uib.ii.algo.st8.start.UnVertex> cover = no.uib.ii.algo.st8.algorithms.ExactVertexCover.findExactVertexCover(graph.getGraph());
    if (cover != null) {
        clearAll();
        markedVertices.addAll(graph.getVertices());
        markedVertices.removeAll(cover);
    }
}