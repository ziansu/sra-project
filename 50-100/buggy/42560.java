@java.lang.Override
public void finishLoad() {
    java.lang.System.out.println(("edges: " + (edges)));
    for (computergraphics.datastructures.halfedge.HalfEdge edge : this.edges) {
        computergraphics.datastructures.halfedge.HalfEdgeVertex vertex = edge.getStartVertex();
        vertex.setHalfEgde(edge);
    }
    for (computergraphics.datastructures.halfedge.HalfEdge edge : this.edges) {
        computergraphics.datastructures.halfedge.HalfEdge opposite = findOpposite(edge);
        edge.setOpposite(opposite);
    }
    computeTriangleNormals();
    computeVerticesNormals();
}