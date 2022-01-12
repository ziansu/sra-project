private void drawRoads(java.awt.Graphics2D g2, client.map.view.Edge edge, client.map.view.CatanColor color) {
    java.awt.geom.Point2D edgeCenter = client.map.view.MapComponent.getEdgeCenterPoint(edge);
    java.lang.Double angle = client.map.view.MapComponent.getEdgeAngle(edge);
    java.util.List<java.awt.geom.Point2D> rotatedRoad = client.map.view.MapComponent.rotateShape(client.map.view.MapComponent.ROAD, angle);
    java.util.List<java.awt.geom.Point2D> completedRoad = client.map.view.MapComponent.translateShape(rotatedRoad, edgeCenter);
    java.awt.Polygon road = client.map.view.MapComponent.toPolygon(completedRoad);
    drawGamePiece(g2, road, color);
}