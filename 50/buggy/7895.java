public void showDominatingSet() {
    java.util.Set<no.uib.ii.algo.st8.start.UnVertex> domset = no.uib.ii.algo.st8.algorithms.ExactDominatingSet.exactDominatingSet(graph.getGraph());
    clearAll();
    markedVertices.addAll(domset);
    redraw();
}