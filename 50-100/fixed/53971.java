private void putEdge(org.opendaylight.controller.sal.core.Edge edge) {
    int node1 = getNodeConnectorIndex(edge.getTailNodeConnector());
    int node2 = getNodeConnectorIndex(edge.getHeadNodeConnector());
    this.edgeMatrix[node1][node2] = edge;
    ugr.cristian.routeApp.RouteHandler.log.trace(((("Put the edge in the position: " + node1) + " ") + node2));
}