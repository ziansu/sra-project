public void addTransition(java.lang.String name, java.lang.Object source, java.lang.Object target) {
    graph.getModel().beginUpdate();
    try {
        com.mxgraph.model.mxCell edge = ((com.mxgraph.model.mxCell) (graph.insertEdge(root, null, name, source, target)));
    } finally {
        graph.getModel().endUpdate();
    }
}