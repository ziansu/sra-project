void handleEdit(modbus.SlaveFolder slave) {
    for (org.dsa.iot.dslink.node.Node event : ((modbus.SlaveNode) (slave)).getSubscribed()) {
        if ((event.getMetaData()) == slave) {
            handleUnsub(((modbus.SlaveNode) (slave)), event);
            handleSub(((modbus.SlaveNode) (slave)), event);
        }
    }
}