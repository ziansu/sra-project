void stop() {
    if (null == (reconnectFuture)) {
        return ;
    }
    reconnectFuture.cancel(false);
    if ((localDevice) != null) {
        localDevice.terminate();
        localDevice = null;
        node.removeChild(bacnet.BacnetConn.ACTION_STOP);
        node.removeChild(bacnet.BacnetConn.ACTION_DISCOVER_DEVICES);
        node.removeChild(bacnet.BacnetConn.ACTION_ADD_DEVICE);
        statnode.setValue(new org.dsa.iot.dslink.node.value.Value(bacnet.BacnetConn.NODE_STATUS_STOPPED));
    }
}