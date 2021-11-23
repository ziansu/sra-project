@java.lang.Override
public void set(us.ihmc.geometry.polytope.ConvexPolytope other) {
    setVertices(other.getVertices());
    setEdges(other.getEdges());
    setFaces(other.getFaces());
}