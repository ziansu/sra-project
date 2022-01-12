void stop() {
    stpe.shutdown();
    if ((master) != null) {
        try {
            master.destroy();
            link.masters.remove(master);
        } catch (java.lang.Exception e) {
            modbus.ModbusConnection.LOGGER.debug(("error destroying last master" + (e.getMessage())));
        }
        statnode.setValue(new org.dsa.iot.dslink.node.value.Value(modbus.ModbusConnection.NODE_STATUS_CONNECTION_STOPPED));
        master = null;
        node.removeChild("stop");
        removeChild();
    }
}