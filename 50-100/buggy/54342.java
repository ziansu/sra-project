private int addMissingVertices(java.lang.Object parent) {
    int oldSize = vertices.size();
    int index = oldSize;
    while ((vertices.size()) < (rewrite.states().size())) {
        java.lang.String label = java.lang.Integer.toString((index++));
        vertices.add(graph.insertVertex(parent, null, label, 20, 20, 20, 20, "ROUNDED"));
    } 
    return oldSize;
}