private void determineCases(sonumina.boqa.calculation.Observations o, boolean[] hidden, sonumina.boqa.calculation.ReducedConfiguration stats) {
    int numTerms = this.slimGraph.getNumberOfVertices();
    for (int i = 0; i < numTerms; i++) {
        sonumina.boqa.calculation.ReducedConfiguration.NodeCase c = getNodeCase(i, hidden, observedTerms);
        stats.increment(c);
    }
}