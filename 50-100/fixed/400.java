private java.util.Set<computergraphics.datastructures.halfedge.HalfEdgeTriangle> getFacetsAroundVertex(computergraphics.datastructures.halfedge.HalfEdgeVertex vertex) {
    java.util.Set<computergraphics.datastructures.halfedge.HalfEdgeTriangle> neighbours = new java.util.HashSet<>();
    computergraphics.datastructures.halfedge.HalfEdge itr = vertex.getHalfEdge();
    computergraphics.datastructures.halfedge.HalfEdge start = itr;
    do {
        neighbours.add(itr.getFacet());
        itr = itr.getNext().getOpposite();
        if (itr == null) {
            return neighbours;
        }
    } while (!(itr.equals(start)) );
    return neighbours;
}