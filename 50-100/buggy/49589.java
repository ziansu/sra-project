private void relinquish(int priority) {
    if ((folder.conn.localDevice) == null) {
        folder.conn.stop();
        return ;
    }
    try {
        folder.conn.localDevice.send(folder.root.device, new com.serotonin.bacnet4j.service.confirmed.WritePropertyRequest(oid, pid, null, new com.serotonin.bacnet4j.type.primitive.Null(), new com.serotonin.bacnet4j.type.primitive.UnsignedInteger(priority)));
    } catch (com.serotonin.bacnet4j.exception.BACnetException e) {
        bacnet.BacnetPoint.LOGGER.error("error: ", e);
    }
}