public org.bubblecloud.zigbee.api.cluster.impl.api.general.DoorLockResponse lock(java.lang.String pinCode) throws org.bubblecloud.zigbee.api.cluster.impl.api.core.ZigBeeClusterException {
    enableDefaultResponse();
    org.bubblecloud.zigbee.api.cluster.impl.api.core.Response response = invoke(new org.bubblecloud.zigbee.api.cluster.impl.general.DoorCommandImpl(true, pinCode));
    return new org.bubblecloud.zigbee.api.cluster.impl.general.DoorLockResponseImpl(response);
}