private void addMissingVertices(java.lang.Object parent) {
    int index = vertices.size();
    while (index < (rewrite.states().size())) {
        java.lang.String label = java.lang.Integer.toString((index++));
        vertices.add(graph.insertVertex(parent, null, label, 20, 20, 20, 20, "ROUNDED"));
    } 
}