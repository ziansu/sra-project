protected java.lang.Long getLastPublishedIDByNode(java.lang.String nodeID) {
    java.lang.Long lastPublishId = null;
    try {
        lastPublishId = slotAgent.getNodeToLastPublishedId(nodeID);
    } catch (org.wso2.andes.kernel.AndesException e) {
        org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.error(("Failed to get last published id from database for node " + nodeID), e);
    }
    return lastPublishId;
}