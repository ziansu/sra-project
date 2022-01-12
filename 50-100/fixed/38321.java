public void reAssignSlotWhenNoSubscribers(java.lang.String nodeId, java.lang.String queueName) throws org.wso2.andes.kernel.AndesException {
    java.lang.String lockKeyForNodeId = nodeId + (org.wso2.andes.kernel.slot.SlotManagerClusterMode.class);
    synchronized(lockKeyForNodeId.intern()) {
        slotAgent.deleteSlotAssignmentByQueueName(nodeId, queueName);
        if (org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.isDebugEnabled()) {
            org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.debug(((("Cleared assigned slots of queue " + queueName) + " Assigned to node ") + nodeId));
        }
    }
}