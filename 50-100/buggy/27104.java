public void setupCoapClient(org.dsa.iot.dslink.node.Node node) {
    org.dsa.iot.coap.CoapClientController controller = new org.dsa.iot.coap.CoapClientController(node);
    node.setMetaData(controller);
    try {
        controller.init();
    } catch (java.lang.Exception e) {
        org.dsa.iot.coap.CoapHandler.LOG.error("Failed to setup COAP client.", e);
        node.getParent().removeChild(node);
    }
}