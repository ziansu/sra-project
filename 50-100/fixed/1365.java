private boolean isNewOrderBetter(java.util.List<java.awt.Point> neighbor, graphs.Graph graph) {
    algorithms.Greedy greedy = new algorithms.Greedy(neighbor);
    graphs.Graph tmp = new graphs.SimpleGraph(((graphs.SimpleGraph) (graph)));
    greedy.applyAlgorithmComplete(tmp);
    return (tmp.getQuantityColors()) < (minimalAmountOfColors);
}