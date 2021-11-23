private void addSubPathToPath(com.tcsorcs.trailsapp.managers.DistanceManager.Node shortestNode) {
    totalDistance += shortestNode.nodeDistance;
    com.tcsorcs.trailsapp.managers.DistanceManager.Node currentNode = shortestNode.parent;
    java.util.ArrayList<com.tcsorcs.trailsapp.helpers.Segment> segmentsList = new java.util.ArrayList<com.tcsorcs.trailsapp.helpers.Segment>();
    while (currentNode != null) {
        path.push(currentNode.scanName);
        currentNode = currentNode.parent;
        segmentsList.add(currentNode.segment);
    } 
    com.tcsorcs.trailsapp.managers.DisplayManager.getInstance().drawSegments(segmentsList);
}