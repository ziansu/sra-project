private java.util.Set<computergraphics.datastructures.halfedge.HalfEdgeTriangle> getFacetsAroundVertex(computergraphics.datastructures.halfedge.HalfEdgeVertex vertex) {
    java.util.Set<computergraphics.datastructures.halfedge.HalfEdgeTriangle> neighbours = new java.util.HashSet<>();
    computergraphics.datastructures.halfedge.HalfEdge itr = vertex.getHalfEdge();
    computergraphics.datastructures.halfedge.HalfEdge start = itr;
    do {
        java.lang.System.out.println(((("n: " + neighbours) + ", itr: ") + itr));
        neighbours.add(itr.getFacet());
        itr = itr.getNext().getOpposite();
    } while (!(itr.equals(start)) );
    return neighbours;
}