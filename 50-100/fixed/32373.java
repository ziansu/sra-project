public void setRoute(int nodeId, int destId, int neighbourId, policies.implementations.gaorexford.GaoRexfordAttribute attribute, int[] path) {
    if (isValidDestination(destId)) {
        simulation.RouteTable routeTable = routeTables.get(network.getNode(nodeId));
        routeTable.setAttribute(network.getNode(destId), network.getNode(neighbourId), attribute);
        routeTable.setPath(network.getNode(destId), network.getNode(neighbourId), new simulation.PathAttribute(pathNodes(path)));
    }
}