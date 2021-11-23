@java.lang.Override
public void onResponderConnected(org.dsa.iot.dslink.DSLink link) {
    opc.Main.LOGGER.info("Connected");
    org.dsa.iot.dslink.node.NodeManager manager = link.getNodeManager();
    org.dsa.iot.dslink.serializer.Serializer copyser = new org.dsa.iot.dslink.serializer.Serializer(manager);
    org.dsa.iot.dslink.serializer.Deserializer copydeser = new org.dsa.iot.dslink.serializer.Deserializer(manager);
    org.dsa.iot.dslink.node.Node superRoot = manager.getNode("/").getNode();
    opc.OpcLink.start(superRoot, copyser, copydeser);
}