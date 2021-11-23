private void learnIPAddress(org.opendaylight.controller.sal.core.Node node, java.net.InetAddress addr, org.opendaylight.controller.sal.core.NodeConnector connector) {
    java.util.Map<org.opendaylight.controller.sal.core.Node, java.net.InetAddress> temp = new java.util.HashMap<org.opendaylight.controller.sal.core.Node, java.net.InetAddress>();
    temp.put(node, addr);
    ugr.cristian.routeApp.RouteHandler.log.debug(((("Guardando: " + temp) + " con el connector ") + connector));
    this.tableIP.put(temp, connector);
}