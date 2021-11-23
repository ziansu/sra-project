public Graph[] getConnectedComponents() {
    int nc = flagConnectedComponents();
    Graph[] comps = new Graph[nc];
    for (int i = 0; i < nc; i++) {
        comps[i] = new Graph();
    }
    for (Graph.Node n : nodes) {
        comps[((int) (n.flag))].nodes.add(n);
    }
    return comps;
}