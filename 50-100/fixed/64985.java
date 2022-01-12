public boolean remove(int node) {
    boolean result = nodes.remove(((java.lang.Integer) (node)));
    weightSum -= structure.weights[node];
    if (nodes.isEmpty()) {
        structure.communities.remove(this);
    }
    return result;
}