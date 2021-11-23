public java.util.Iterator<E> minimumSpanningTree() {
    lab3.CompKruskalEdge kruskal = new lab3.CompKruskalEdge(number, edges);
    return kruskal.getMinimumSpanningTree();
}