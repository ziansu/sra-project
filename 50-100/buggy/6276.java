public gtna.graph.Edge[] generateEdgesUnidirectional() {
    int index = 0;
    gtna.graph.Edge[] edges = new gtna.graph.Edge[(this.parent.length) - 1];
    for (int i = 0; i < (this.parent.length); i++) {
        if (i != (-1)) {
            edges[(index++)] = new gtna.graph.Edge(this.parent[i], i);
        }
    }
    return edges;
}