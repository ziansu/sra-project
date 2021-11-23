public java.util.List<datastructs.graph.Node> getRightNodes() {
    java.util.List<datastructs.graph.Node> rightNodes = new java.util.ArrayList<>();
    for (datastructs.graph.Edge e : adjacentEdges) {
        if (e.getLeft().equals(this)) {
            java.lang.System.out.println(((("Adding " + (e.getRight().getName())) + " to right of ") + (name)));
            rightNodes.add(e.getRight());
        }
    }
    return rightNodes;
}