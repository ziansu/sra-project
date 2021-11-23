public boolean graphContainsVertexWithCoordinates(pathfinding.LatLngFlr c) {
    pathfinding.LatLngGraphVertex vTemp = new pathfinding.LatLngGraphVertex(c, 0, pathfinding.JGraphTWrapper.GraphElementType.DEFAULT);
    if (graph.containsVertex(vTemp))
        return true;
    else
        return false;
    
}