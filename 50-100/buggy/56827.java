private org.wso2.andes.kernel.slot.Slot getOverlappedSlot(java.lang.String nodeId, java.lang.String queueName) {
    org.wso2.andes.kernel.slot.Slot slotToBeAssigned = null;
    java.lang.String lockKey = queueName + (org.wso2.andes.kernel.slot.SlotManagerClusterMode.class);
    synchronized(lockKey.intern()) {
        try {
            slotToBeAssigned = slotAgent.getOverlappedSlot(nodeId, queueName);
        } catch (org.wso2.andes.kernel.AndesException e) {
            org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.error(("Failed to get overlapped slots for queue: " + queueName), e);
        }
    }
    return slotToBeAssigned;
}