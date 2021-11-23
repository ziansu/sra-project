protected void stop() {
    statnode.setValue(new org.dsa.iot.dslink.node.value.Value(bacnet.BacnetConn.NODE_STATUS_STOPPED));
    try {
        monitor.checkInWriter();
        if ((localDevice) != null) {
            localDevice.terminate();
            localDevice = null;
        }
        monitor.checkOutWriter();
    } catch (java.lang.InterruptedException e) {
    }
}