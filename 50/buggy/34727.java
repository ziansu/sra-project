public boolean AddDevice(networkmodeling.core.modelgraph.NetworkGraphNode dev) {
    if (!(graphNodes.contains(dev))) {
        getGraphNodes().add(dev);
        return true;
    }
    return false;
}