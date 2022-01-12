private void updateNeighbours() {
    org.openhab.binding.zwave.internal.protocol.ZWaveNode node = controllerHandler.getNode(nodeId);
    if (node == null) {
        return ;
    }
    java.lang.String neighbours = "";
    for (java.lang.Integer s : node.getNeighbors()) {
        if ((neighbours.length()) != 0) {
            neighbours += ',';
        }
        neighbours += s;
    }
    getThing().setProperty(ZWaveBindingConstants.PROPERTY_NEIGHBOURS, "");
}