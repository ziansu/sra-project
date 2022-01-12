void handleEdit(modbus.SlaveFolder slave) {
    java.util.Set<org.dsa.iot.dslink.node.Node> set = new java.util.HashSet(((modbus.SlaveNode) (slave)).getSubscribed());
    for (org.dsa.iot.dslink.node.Node event : set) {
        if ((event.getMetaData()) == slave) {
            handleUnsub(((modbus.SlaveNode) (slave)), event);
            handleSub(((modbus.SlaveNode) (slave)), event);
        }
    }
}