public Graph[] getConnectedComponents() {
    int nc = flagConnectedComponents();
    Graph[] comps = new Graph[nc];
    for (Graph.Node n : nodes) {
        comps[((int) (n.flag))].nodes.add(n);
    }
    return comps;
}