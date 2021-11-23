public static boolean canObserverSeeEdge(int edgeIndex, double observerX, double observerY, java.util.List<? extends us.ihmc.euclid.tuple2D.interfaces.Point2DReadOnly> convexPolygon2D, int numberOfVertices, boolean clockwiseOrdered) {
    us.ihmc.euclid.geometry.tools.EuclidGeometryPolygonTools.checkNumberOfVertices(convexPolygon2D, numberOfVertices);
    us.ihmc.euclid.geometry.tools.EuclidGeometryPolygonTools.checkEdgeIndex(edgeIndex, numberOfVertices);
    us.ihmc.euclid.tuple2D.interfaces.Point2DReadOnly edgeStart = convexPolygon2D.get(edgeIndex);
    us.ihmc.euclid.tuple2D.interfaces.Point2DReadOnly edgeEnd = convexPolygon2D.get(us.ihmc.euclid.geometry.tools.EuclidGeometryPolygonTools.next(edgeIndex, numberOfVertices));
    return isPoint2DOnSideOfLine2D(observerX, observerY, edgeStart, edgeEnd, clockwiseOrdered);
}