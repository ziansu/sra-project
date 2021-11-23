public void addEdge(E source, E dest, double cost) {
    FHflowVertex<E> src;
    FHflowVertex<E> dst;
    src = addToVertexSet(source);
    dst = addToVertexSet(dest);
    src.addToResAdjList(dst, cost);
    dst.addToResAdjList(src, 0);
    src.addToFlowAdjList(dst, cost);
}