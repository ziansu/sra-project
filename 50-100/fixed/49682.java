public void setupCoapServer(org.dsa.iot.dslink.node.Node node) {
    org.dsa.iot.coap.CoapServerController controller = new org.dsa.iot.coap.CoapServerController(node, this);
    node.setMetaData(controller);
    try {
        controller.init();
    } catch (java.lang.Exception e) {
        org.dsa.iot.coap.CoapHandler.LOG.error("Failed to setup COAP server.", e);
        node.getParent().removeChild(node, false);
    }
}