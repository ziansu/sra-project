private java.util.Stack<java.lang.Integer> getVertices() {
    java.util.Stack<java.lang.Integer> vertices = new java.util.Stack<>();
    for (java.lang.Integer vertex : theGraph.keySet()) {
        vertices.add(vertex);
    }
    return vertices;
}