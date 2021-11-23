public boolean addVertex(geography.GeographicPoint location) {
    roadgraph.MapNode newNode = new roadgraph.MapNode(location);
    if ((nodes.contains(newNode)) || (location == null)) {
        return false;
    }
    nodes.add(newNode);
    return true;
}