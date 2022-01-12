public static java.awt.Point getClosestPoint(java.awt.Point source, java.util.List<java.awt.geom.Point2D> pool) {
    double closestDistance = java.lang.Double.MAX_VALUE;
    java.awt.Point closestPoint = null;
    for (java.awt.geom.Point2D possibleClosestPoint : pool) {
        if (closestPoint == null) {
            closestDistance = source.distance(possibleClosestPoint);
            closestPoint = games.strategy.triplea.ui.RouteOptimizer.getPoint(possibleClosestPoint);
        }else {
            double distance = source.distance(possibleClosestPoint);
            if (closestDistance > distance) {
                closestPoint = games.strategy.triplea.ui.RouteOptimizer.getPoint(possibleClosestPoint);
                closestDistance = distance;
            }
        }
    }
    return closestPoint;
}