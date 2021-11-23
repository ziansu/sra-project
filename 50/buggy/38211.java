public boolean graphIsConnected() {
    org.jgrapht.alg.ConnectivityInspector<pathfinding.LatLngGraphVertex, pathfinding.LatLngGraphEdge> connectivityInspector = new org.jgrapht.alg.ConnectivityInspector<pathfinding.LatLngGraphVertex, pathfinding.LatLngGraphEdge>(graph);
    if (connectivityInspector.isGraphConnected())
        return true;
    else
        return false;
    
}