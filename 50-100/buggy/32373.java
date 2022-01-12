public void setRoute(int nodeId, int destId, int neighbourId, policies.implementations.gaorexford.GaoRexfordAttribute.Type type, int[] path) {
    if (isValidDestination(destId)) {
        simulation.RouteTable routeTable = routeTables.get(network.getNode(nodeId));
        routeTable.setAttribute(network.getNode(destId), network.getNode(neighbourId), new policies.implementations.gaorexford.GaoRexfordAttribute(type));
        routeTable.setPath(network.getNode(destId), network.getNode(neighbourId), new simulation.PathAttribute(pathNodes(path)));
    }
}