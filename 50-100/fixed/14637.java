private void addSubPathToPath(com.tcsorcs.trailsapp.managers.DistanceManager.Node shortestNode) {
    totalDistance += shortestNode.nodeDistance;
    com.tcsorcs.trailsapp.managers.DistanceManager.Node currentNode = shortestNode;
    java.util.ArrayList<com.tcsorcs.trailsapp.helpers.Segment> segmentsList = new java.util.ArrayList<com.tcsorcs.trailsapp.helpers.Segment>();
    while ((currentNode.parent) != null) {
        segmentsList.add(currentNode.segment);
        currentNode = currentNode.parent;
        path.push(currentNode.scanName);
    } 
    com.tcsorcs.trailsapp.managers.DisplayManager.getInstance().drawSegments(segmentsList);
}