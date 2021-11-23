private void topologicalSort() {
    java.util.LinkedList<datastructure.DrawNode> sorted = new java.util.LinkedList<>();
    while (!(drawNodes.isEmpty())) {
        topologicalSortUtil(drawNodes.getFirst(), sorted);
    } 
    drawNodes = sorted;
}