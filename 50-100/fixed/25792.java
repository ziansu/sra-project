private java.util.List<geography.GeographicPoint> reconstructPath(java.util.HashMap<roadgraph.MapNode, roadgraph.MapNode> parentMap, roadgraph.MapNode start, roadgraph.MapNode goal) {
    java.util.LinkedList<geography.GeographicPoint> path = new java.util.LinkedList<geography.GeographicPoint>();
    roadgraph.MapNode current = goal;
    while (!(current.equals(start))) {
        path.addFirst(current.getLocation());
        current = parentMap.get(current);
    } 
    path.addFirst(start.getLocation());
    return path;
}