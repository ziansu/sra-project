public boolean ConnectDevices(networkmodeling.core.modelgraph.NetworkGraphNode dev1, networkmodeling.core.modelgraph.NetworkGraphNode dev2) {
    networkmodeling.core.modelgraph.NetworkGraphEdge newEdge = new networkmodeling.core.modelgraph.NetworkGraphEdge(dev1, dev2);
    if (!(graphEdges.contains(newEdge))) {
        getGraphEdges().add(newEdge);
        return true;
    }
    return false;
}