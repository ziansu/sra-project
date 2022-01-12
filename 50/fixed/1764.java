public boolean add(int node) {
    nodes.add(node);
    weightSum += structure.weights[node];
    return true;
}