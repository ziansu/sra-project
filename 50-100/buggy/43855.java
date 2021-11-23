private java.util.List<geography.GeographicPoint> reconstructPath(java.util.HashMap<roadgraph.MapNode, roadgraph.MapNode> parentMap, roadgraph.MapNode start, roadgraph.MapNode goal) {
    java.util.LinkedList<geography.GeographicPoint> path = new java.util.LinkedList<geography.GeographicPoint>();
    roadgraph.MapNode current = start;
    while (!(current.equals(goal))) {
        path.addFirst(current.getLocation());
        current = parentMap.get(current);
    } 
    return path;
}