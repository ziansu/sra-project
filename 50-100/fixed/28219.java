public boolean addVertex(geography.GeographicPoint location) {
    roadgraph.MapNode newNode = new roadgraph.MapNode(location);
    if ((location == null) || (nodes.contains(newNode))) {
        return false;
    }
    nodes.add(newNode);
    return true;
}