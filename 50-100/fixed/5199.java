public java.util.List<datastructs.graph.Node> getRightNodes() {
    java.util.List<datastructs.graph.Node> rightNodes = new java.util.ArrayList<>();
    for (datastructs.graph.Edge e : adjacentEdges) {
        if (e.getLeft().equals(this)) {
            rightNodes.add(e.getRight());
        }
    }
    return rightNodes;
}