public code.comp261.ass1.Node findClosest(code.comp261.ass1.Location location) {
    double shortestPath = java.lang.Double.MAX_VALUE;
    code.comp261.ass1.Node closestIntersection = null;
    for (code.comp261.ass1.Node node : nodeMap.values()) {
        double distance = location.distance(node.location);
        if (distance < shortestPath) {
            shortestPath = distance;
            closestIntersection = node;
        }
    }
    if (closestIntersection == null)
        return null;
    else
        return closestIntersection;
    
}