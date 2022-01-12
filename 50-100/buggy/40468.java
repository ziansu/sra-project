private com.serotonin.bacnet4j.type.constructed.PriorityArray getPriorityArray() throws com.serotonin.bacnet4j.exception.BACnetException {
    if ((folder.conn.localDevice) == null) {
        folder.conn.stop();
        return null;
    }
    com.serotonin.bacnet4j.type.Encodable e = com.serotonin.bacnet4j.util.RequestUtils.getProperty(folder.conn.localDevice, folder.root.device, oid, PropertyIdentifier.priorityArray);
    if (e instanceof com.serotonin.bacnet4j.type.constructed.BACnetError)
        return null;
    
    return ((com.serotonin.bacnet4j.type.constructed.PriorityArray) (e));
}