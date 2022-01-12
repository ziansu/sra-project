private java.util.List<org.educationalProject.surfacePathfinder.Point> retrievalPath(org.educationalProject.surfacePathfinder.Point target) {
    java.util.List<org.educationalProject.surfacePathfinder.Point> shortestPath = new java.util.ArrayList<org.educationalProject.surfacePathfinder.Point>();
    org.educationalProject.surfacePathfinder.Point step = target;
    if ((predecessors.get(step)) == null) {
        return null;
    }
    shortestPath.add(step);
    while ((predecessors.get(step)) != null) {
        step = predecessors.get(step);
        shortestPath.add(step);
    } 
    java.util.Collections.reverse(shortestPath);
    return shortestPath;
}